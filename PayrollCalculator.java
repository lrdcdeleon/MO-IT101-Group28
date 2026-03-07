package moit101.group28;

/**
 * The PayrollCalculator class handles the computation of gross salary,
 * standard government deductions (SSS, PhilHealth, Pag-IBIG, WTax), 
 * and net weekly salary for MotorPH employees.
 * * @author King Dominic and Group 28
 */
public class PayrollCalculator {

    /**
     * Calculates the gross weekly salary based on hours worked.
     * * @param hourlyRate The employee's hourly wage.
     * @param weeklyHoursWorked Total hours worked in a week.
     * @return The computed gross weekly salary.
     */
    public double calculateGrossWeeklySalary(double hourlyRate, double weeklyHoursWorked) {
        return hourlyRate * weeklyHoursWorked;
    }

    /**
     * Calculates the SSS Deduction.
     * Note: Standard SSS is computed monthly. This assumes a simplified percentage 
     * or standard table lookup. For Phase 1, we use a placeholder of 4.5% for the employee share.
     * * @param grossMonthlySalary The gross monthly salary used as the basis.
     * @return The weekly SSS deduction.
     */
    public double calculateSSSDeduction(double grossMonthlySalary) {
        // TODO: Replace with actual MotorPH SSS contribution table logic if provided.
        double monthlySSS = grossMonthlySalary * 0.045; 
        return monthlySSS / 4; // Divided by 4 for weekly computation
    }

    /**
     * Calculates the PhilHealth Deduction.
     * The standard premium rate is usually 5% split equally between employer and employee (2.5% each).
     * * @param grossMonthlySalary The gross monthly salary used as the basis.
     * @return The weekly PhilHealth deduction.
     */
    public double calculatePhilHealthDeduction(double grossMonthlySalary) {
        double monthlyPhilHealth = grossMonthlySalary * 0.025; // 2.5% employee share
        return monthlyPhilHealth / 4; // Divided by 4 for weekly computation
    }

    /**
     * Calculates the Pag-IBIG Deduction.
     * The standard employee share is a maximum of 100 PHP per month.
     * * @param grossMonthlySalary The gross monthly salary.
     * @return The weekly Pag-IBIG deduction.
     */
    public double calculatePagIbigDeduction(double grossMonthlySalary) {
        double monthlyPagIbig = 100.00; // Standard max employee contribution
        return monthlyPagIbig / 4; // Divided by 4 for weekly computation
    }

    /**
     * Computes the final Net Weekly Salary after all deductions.
     * * @param grossWeeklySalary The employee's gross pay for the week.
     * @param totalWeeklyDeductions The sum of SSS, PhilHealth, Pag-IBIG, and Tax for the week.
     * @return The net weekly salary.
     */
    public double computeNetWeeklySalary(double grossWeeklySalary, double totalWeeklyDeductions) {
        return grossWeeklySalary - totalWeeklyDeductions;
    }
}
