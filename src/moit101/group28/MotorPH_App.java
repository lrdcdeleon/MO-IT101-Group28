/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moit101.group28;

/**
 * MotorPH Application Main Class
 * @author King Dominic and Group 28
 */
public class MotorPH_App {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // Initialize the calculator
        PayrollCalculator calc = new PayrollCalculator();
        
        // Sample Employee Data (Juan Dela Cruz)
        double hourlyRate = 500.00;
        double hoursWorked = 40.0;
        double expectedMonthlyGross = hourlyRate * 160; // Approximate monthly for deduction basis
        
        // Step 1: Compute Gross Weekly Salary
        double grossWeekly = calc.calculateGrossWeeklySalary(hourlyRate, hoursWorked);
        
        // Step 2: Compute Weekly Deductions
        double sss = calc.calculateSSSDeduction(expectedMonthlyGross);
        double philHealth = calc.calculatePhilHealthDeduction(expectedMonthlyGross);
        double pagIbig = calc.calculatePagIbigDeduction(expectedMonthlyGross);
        double totalDeductions = sss + philHealth + pagIbig;
        
        // Step 3: Compute Net Weekly Salary
        double netWeekly = calc.computeNetWeeklySalary(grossWeekly, totalDeductions);
        
        // Print the Payroll Summary
        System.out.println("--- MotorPH Weekly Payroll Summary ---");
        System.out.println("Gross Weekly Salary: PHP " + grossWeekly);
        System.out.println("Total Deductions: PHP " + totalDeductions);
        System.out.println("Net Weekly Salary: PHP " + netWeekly);
    }
}