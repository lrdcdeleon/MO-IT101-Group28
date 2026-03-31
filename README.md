MotorPH Payroll System - Terminal Assessment
📋 Project Overview
This repository contains the finalized Phase 1 development for the MotorPH Employee Payroll System. This project automates the transition from manual payroll entry to a sophisticated, file-driven system. It handles data parsing, government-mandated deductions, and net salary computations to ensure high accuracy for MotorPH’s HR department.

👥 Team Members (Group 28)
Dianna Cathlene De Leon (GitHub: lrdcdeleon) - Project Owner / Lead Developer

Jastien Kenneth Sarip - Collaborator

Cathryn Degamon - Collaborator

Mikylla Angela Reyes - Collaborator

Prince Sweetheart Descaya - Collaborator

🚀 Key Features
Automated Data Processing: Replaced manual console entry with Java File I/O. The system uses BufferedReader to parse employee records directly from employee_data.txt.

Modular Deduction Logic: Implemented procedural methods for specific Philippine government deductions:

SSS: Automated percentage-based deduction.

PhilHealth: Health insurance contribution logic.

Pag-IBIG: Fixed-rate housing fund contribution.

Income Tax: Calculated withholding tax based on gross earnings.

Interactive Simulation: Includes a Scanner-based mode for manual payroll testing and real-time input validation.

Validation & Error Handling: * Ensures all salary inputs are positive values.

Handles file-not-found exceptions and data formatting errors gracefully.

Version Control: Managed via Git, utilizing branching (Master/Main) and collaborative commits to track development history.

🛠️ Technical Stack
Language: Java (JDK 17+)

IDE: Apache NetBeans

Version Control: Git & GitHub

Data Format: Plain Text (.txt)

📂 File Structure
MotorPH_ReadFromFile.java: The main automated entry point.

MotorPH_ApplyDeductions.java: Contains the procedural logic for net pay.

ComputeSemiMonthlySalary.java: Interactive tool for manual calculation.

employee_data.txt: The external database containing employee names and gross salaries.

⚙️ How to Run
Clone the Repository:

Bash
git clone https://github.com/lrdcdeleon/MO-IT101-Group28.git
Open in NetBeans: Select "Open Project" and navigate to the MO-IT101-Group28 folder.

Prepare Data: Ensure employee_data.txt is located in the project root directory.

Execute:

Right-click MotorPH_ReadFromFile.java and select Run File to process the automated payroll report.

Verify the output in the NetBeans console.
