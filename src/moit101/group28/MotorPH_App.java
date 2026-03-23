package moit101.group28;

/**
 * MotorPH Main Application - Phase 1.
 * @author Dianna Cathlene De Leon and Group 28
 */
public class MotorPH_App {

    public static void main(String[] args) {
        PayrollCalculator calc = new PayrollCalculator();
        
        // Set the employee data for Juan Dela Cruz.
        double hourlyRate = 500.00;
        double weeklyHours = calc.calculateHoursWorked("08:00", "17:00") * 5; 
        
        // Compute the gross weekly salary based on total hours.
        double grossSalary = calc.calculateGrossWeeklySalary(hourlyRate, weeklyHours);
        
        // Professor's Rule: Deductions are only applicable for the second cutoff.
        int cutoffNumber = 2; 
        double totalDeductions = 0.0;

        if (cutoffNumber == 2) {
            double monthlyBasis = hourlyRate * 160;
            totalDeductions = calc.calculateSSSDeduction(monthlyBasis) + 
                              calc.calculatePhilHealthDeduction(monthlyBasis) + 
                              calc.calculatePagIbigDeduction();
        }

        // Compute the net weekly salary after deductions.
        double netSalary = calc.computeNetSalary(grossSalary, totalDeductions);
        
        // Print the final payroll summary.
        System.out.println("--- MotorPH Weekly Payroll Summary ---");
        System.out.println("Employee Name: Juan Dela Cruz");
        System.out.println("Gross Weekly Salary: PHP " + grossSalary);
        System.out.println("Total Deductions: PHP " + totalDeductions);
        System.out.println("Net Weekly Salary: PHP " + netSalary);
    }
}