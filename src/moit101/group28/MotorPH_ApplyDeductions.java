package moit101.group28; // Matches your project package

import java.util.Scanner;

/**
 * MotorPH Payroll System - Task 9
 * Refactored to include government deductions and net pay calculation.
 */
public class MotorPH_ApplyDeductions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // === Step 1: Collect Input (Reused from Task 8) ===
        System.out.println("--- MotorPH Payroll System: Deductions & Net Pay ---");
        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter Hourly Rate: ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Enter Total Hours Worked: ");
        double hoursWorked = scanner.nextDouble();

        // === Step 5: Validation ===
        if (hourlyRate <= 0 || hoursWorked <= 0) {
            System.out.println("❌ Error: Rate and hours must be positive numbers.");
        } else {
            // Calculate Gross Salary
            double grossSalary = hourlyRate * hoursWorked;

            // === Step 3 & 4: Compute and Display Results ===
            // We call computeNetPay, which internally calls all other deduction methods.
            double netPay = computeNetPay(grossSalary);

            // Detailed Summary Report
            System.out.println("\n==========================================");
            System.out.println("          PAYROLL SUMMARY REPORT          ");
            System.out.println("==========================================");
            System.out.println("Employee Name    : " + employeeName);
            System.out.println("Gross Salary     : ₱" + grossSalary);
            System.out.println("------------------------------------------");
            System.out.println("DEDUCTIONS:");
            System.out.println("SSS              : ₱" + computeSSS(grossSalary));
            System.out.println("PhilHealth       : ₱" + computePhilHealth(grossSalary));
            System.out.println("Pag-IBIG         : ₱" + computePagIbig(grossSalary));
            System.out.println("Income Tax       : ₱" + computeIncomeTax(grossSalary));
            System.out.println("------------------------------------------");
            
            double totalDeductions = grossSalary - netPay;
            System.out.println("Total Deductions : ₱" + totalDeductions);
            System.out.println("NET PAY          : ₱" + netPay);
            System.out.println("==========================================");
        }
        scanner.close();
    }

    // === Step 2: Deduction Methods ===

    /** Computes SSS deduction (Placeholder: 2% of gross) */
    public static double computeSSS(double gross) {
        return gross * 0.02;
    }

    /** Computes PhilHealth deduction (Placeholder: 1.5% of gross) */
    public static double computePhilHealth(double gross) {
        return gross * 0.015;
    }

    /** Computes Pag-IBIG deduction (Fixed amount example: ₱100) */
    public static double computePagIbig(double gross) {
        return 100.0;
    }

    /** Computes Income Tax (Placeholder: 10% of gross) */
    public static double computeIncomeTax(double gross) {
        return gross * 0.10;
    }

    // === Step 3: Net Pay Method ===

    /** * Sums all deductions by calling the specific methods above 
     * and subtracts them from the gross salary.
     */
    public static double computeNetPay(double gross) {
        double totalDeductions = computeSSS(gross) + 
                                 computePhilHealth(gross) + 
                                 computePagIbig(gross) + 
                                 computeIncomeTax(gross);
        return gross - totalDeductions;
    }
}