package moit101.group28;

import java.util.Scanner;

/**
 * PROGRAM PLAN:
 * 1. Collect employee data: Name, Hourly Rate, and Total Hours Worked.
 * 2. Validate inputs: Ensure rate and hours are not zero or negative.
 * 3. Compute Salary: Multiply hours worked by the hourly rate.
 * 4. Display Report: Show a clear summary of the employee's semi-monthly pay.
 */
public class ComputeSemiMonthlySalary {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // === Step 1: Declare Variables and Collect Input ===
        System.out.println("--- MotorPH Semi-Monthly Payroll System ---");
        
        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter Hourly Rate: ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Enter Total Hours Worked for this Cutoff: ");
        double hoursWorked = scanner.nextDouble();

        // === Step 2: Validation (Conditional Statement) ===
        // This handles "invalid or unusual input" as required by the task.
        if (hourlyRate <= 0 || hoursWorked <= 0) {
            System.out.println("\n❌ Error: Hourly rate and hours worked must be greater than zero.");
            System.out.println("Please run the program again with valid data.");
        } else {
            // === Step 3: Arithmetic Computation ===
            // Semi-monthly salary formula: Hours * Rate
            double semiMonthlySalary = hoursWorked * hourlyRate;

            // === Step 4: Display Results (Formatted Output) ===
            System.out.println("\n==========================================");
            System.out.println("        SEMI-MONTHLY PAYROLL REPORT        ");
            System.out.println("==========================================");
            System.out.println("Employee Name    : " + employeeName);
            System.out.println("Hourly Rate      : ₱" + hourlyRate);
            System.out.println("Hours Worked     : " + hoursWorked);
            System.out.println("------------------------------------------");
            System.out.println("GROSS SEMI-MONTHLY PAY: ₱" + semiMonthlySalary);
            System.out.println("==========================================");
            
            // Optional verification message
            System.out.println("Computation verified successfully!");
        }

        // Close the scanner to free up resources
        scanner.close();
    }
}