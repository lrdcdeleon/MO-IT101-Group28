package moit101.group28;

/**
 * Handles payroll logic for MotorPH, including gross salary and deductions.
 */
public class PayrollCalculator {

    // Calculates weekly gross pay based on hourly rate and hours worked [cite: 50]
    public double calculateGrossWeeklySalary(double hourlyRate, double weeklyHoursWorked) {
        return hourlyRate * weeklyHoursWorked;
    }

    // Computes weekly SSS based on a 4.5% monthly estimate [cite: 52]
    public double calculateSSSDeduction(double grossMonthlySalary) {
        return (grossMonthlySalary * 0.045) / 4;
    }

    // Computes weekly PhilHealth based on 2.5% employee share [cite: 52]
    public double calculatePhilHealthDeduction(double grossMonthlySalary) {
        return (grossMonthlySalary * 0.025) / 4;
    }

    // Computes weekly Pag-IBIG standard contribution [cite: 52]
    public double calculatePagIbigDeduction(double grossMonthlySalary) {
        return 100.00 / 4;
    }

    // Returns final net pay after all deductions are removed [cite: 52]
    public double computeNetWeeklySalary(double grossWeekly, double totalDeductions) {
        return grossWeekly - totalDeductions;
    }
}