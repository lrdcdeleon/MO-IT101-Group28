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
        
        // Subtracting 1 hour for mandatory lunch break as per standard shift
        double hours = Duration.between(start, end).toMinutes() / 60.0;
        return hours - 1.0; 
    }

    public double calculateGrossWeeklySalary(double hourlyRate, double totalHours) {
        return hourlyRate * totalHours; 
    }

    public double calculateSSSDeduction(double monthlyGross) {
        return (monthlyGross * 0.045) / 4;
    }

    public double calculatePhilHealthDeduction(double monthlyGross) {
        return (monthlyGross * 0.025) / 4;
    }

    public double calculatePagIbigDeduction() {
        return 100.00 / 4;
    }

    public double computeNetSalary(double gross, double deductions) {
        return gross - deductions; 
    }
}