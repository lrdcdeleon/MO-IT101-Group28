# 🏦 MotorPH Payroll System - Terminal Assessment

## 📝 Project Overview
This repository contains the finalized **Phase 1** development for the **MotorPH Employee Payroll System**. This project automates the transition from manual payroll entry to a sophisticated, file-driven system that handles data parsing, government-mandated deductions, and net salary computations.

## 👥 Team Members (Group 28)
* **Dianna Cathlene De Leon** (GitHub: `lrdcdeleon`) - *Project Owner / Lead Developer*
* **Jastien Kenneth Sarip** - *Collaborator*
* **Cathryn Degamon** - *Collaborator*
* **Mikylla Angela Reyes** - *Collaborator*
* **Prince Sweetheart Descaya** - *Collaborator*

## 🚀 Key Features
* **Automated Data Processing:** Uses `BufferedReader` to parse employee records directly from `employee_data.txt`.
* **Modular Deduction Logic:** Dedicated methods for specific Philippine government deductions:
    * **SSS:** Automated percentage-based deduction.
    * **PhilHealth:** Health insurance contribution logic.
    * **Pag-IBIG:** Fixed-rate housing fund contribution.
    * **Income Tax:** Withholding tax based on gross earnings.
* **Interactive Simulation:** Includes a `Scanner`-based mode for manual testing and real-time validation.
* **Error Handling:** Gracefully manages file-not-found exceptions and invalid numeric inputs.

## 🛠️ Technical Stack
* **Language:** Java (JDK 17+)
* **IDE:** Apache NetBeans
* **Version Control:** Git & GitHub
* **Data Format:** Plain Text (`.txt`)

## 📂 File Structure
* `MotorPH_ReadFromFile.java` - The main automated entry point.
* `MotorPH_ApplyDeductions.java` - Logic for deductions and net pay.
* `ComputeSemiMonthlySalary.java` - Manual calculation tool.
* `employee_data.txt` - External database for names and salaries.

## ⚙️ How to Run
1. **Clone the Repository:**
   ```bash
   git clone [https://github.com/lrdcdeleon/MO-IT101-Group28.git](https://github.com/lrdcdeleon/MO-IT101-Group28.git)
