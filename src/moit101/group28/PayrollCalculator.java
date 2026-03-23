package moit101.group28;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Handles payroll logic including time calculations and government deductions.
 * @author Dianna Cathlene De Leon and Group 28
 */
public class PayrollCalculator {

    public double calculateHoursWorked(String timeIn, String timeOut) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime start = LocalTime.parse(timeIn, formatter);
        LocalTime end = LocalTime.parse(timeOut, formatter);
        
        double hours = Duration.between(start, end).toMinutes() / 60.0;
        
        // Boundary Error Fix: Only subtract 1 hour for lunch if the shift is longer than 4 hours.
        if (hours > 4.0) {
            hours = hours - 1.0; 
        }
        
        return hours; 
    }

    public double calculateGrossWeeklySalary(double hourlyRate, double totalHours) {
        // Computes gross salary by multiplying the hourly rate by total hours worked.
        return hourlyRate * totalHours; 
    }

    public double calculateSSSDeduction(double monthlyGross) {
        // Calculates the weekly SSS deduction based on a flat percentage.
        return (monthlyGross * 0.045) / 4;
    }

    public double calculatePhilHealthDeduction(double monthlyGross) {
        // Calculates the weekly PhilHealth deduction.
        return (monthlyGross * 0.025) / 4;
    }

    public double calculatePagIbigDeduction() {
        // Calculates the weekly Pag-IBIG deduction.
        return 100.00 / 4;
    }

    public double computeNetSalary(double gross, double deductions) {
        // Computes the final take-home pay by subtracting total deductions from the gross salary.
        return gross - deductions; 
    }
}