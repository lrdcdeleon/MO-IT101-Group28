package moit101.group28;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * MotorPH Payroll System - Task 10: File Handling
 * This program automates payroll by reading employee records from a text file.
 */
public class MotorPH_ReadFromFile {

    public static void main(String[] args) {
        // Path to the data file
        String filePath = "employee_data.txt"; 

        // === Step 3: File-Handling Logic ===
        // Using try-with-resources to ensure the BufferedReader closes automatically
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("--- MotorPH Automated Payroll Report ---");
            System.out.println("Reading data from: " + filePath + "\n");

            // Read the file line by line until the end
            while ((line = reader.readLine()) != null) {
                // Skip empty lines
                if (line.trim().isEmpty()) continue;

                // Parse the name and salary (assuming "Name, Salary" format)
                String[] data = line.split(",");
                if (data.length < 2) {
                    System.out.println("⚠ Skipping invalid record: " + line);
                    continue;
                }

                String name = data[0].trim();
                try {
                    double grossSalary = Double.parseDouble(data[1].trim());

                    // Validate that the salary is positive
                    if (grossSalary <= 0) {
                        System.out.println("❌ Invalid salary for " + name + ": ₱" + grossSalary);
                    } else {
                        // === Step 4: Integrate Calculations ===
                        displayPayrollSummary(name, grossSalary);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("❌ Error parsing salary for " + name + ": " + data[1]);
                }
            }
            System.out.println("\nPayroll processing complete.");

        } catch (IOException e) {
            // Step 6: Handle missing files or reading errors
            System.out.println("❌ Error: Could not find or read the file '" + filePath + "'.");
            System.out.println("Ensure the file is in the root folder of your project.");
        }
    }

    // === Step 5: Display Results ===
    public static void displayPayrollSummary(String name, double gross) {
        double netPay = computeNetPay(gross);

        System.out.println("==========================================");
        System.out.println("Employee Name    : " + name);
        System.out.println("Gross Salary     : ₱" + gross);
        System.out.println("------------------------------------------");
        System.out.println("Deductions:");
        System.out.printf("  SSS            : ₱%.2f\n", computeSSS(gross));
        System.out.printf("  PhilHealth     : ₱%.2f\n", computePhilHealth(gross));
        System.out.printf("  Pag-IBIG       : ₱%.2f\n", computePagIbig(gross));
        System.out.printf("  Income Tax     : ₱%.2f\n", computeIncomeTax(gross));
        System.out.println("------------------------------------------");
        System.out.printf("NET PAY          : ₱%.2f\n", netPay);
        System.out.println("==========================================");
    }

    // === Deduction Methods (From Task 9) ===

    public static double computeSSS(double gross) { return gross * 0.02; }
    public static double computePhilHealth(double gross) { return gross * 0.015; }
    public static double computePagIbig(double gross) { return 100.0; }
    public static double computeIncomeTax(double gross) { return gross * 0.10; }

    public static double computeNetPay(double gross) {
        return gross - (computeSSS(gross) + computePhilHealth(gross) + 
                        computePagIbig(gross) + computeIncomeTax(gross));
    }
}