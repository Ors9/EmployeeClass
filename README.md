# Employee Management System

This Java project implements a polymorphic payroll system for managing different types of employees. It calculates salaries, handles various payment schemes, and awards a birthday bonus when applicable.

## 👥 Inheritance Structure

The class hierarchy follows this structure:

                Employee
     /        /       \        \

Each employee type overrides the `earnings()` method and holds specific salary data.

---

## 📅 Birthday Feature

A new class, `DayOfBirth`, was added to store each employee's birthdate (day, month, year).

### 💡 Birthday Bonus
- When the current system month matches the employee's birth month, they receive a **₪200 bonus**.
- The program detects the current month using `java.util.Calendar.getInstance()`.

---

## 💼 Supported Employee Types

| Type                     | Description |
|--------------------------|-------------|
| `SalariedEmployee`       | Fixed monthly salary |
| `HourlyEmployee`         | Paid per hour, with hours worked provided |
| `CommissionEmployee`     | Paid by percentage of sales |
| `BasePlusCommissionEmployee` | Like `CommissionEmployee`, but includes base salary |
| `PieceWorker`            | Paid per item produced (added as part of extension) |

---

## 📋 Example Output

For an employee like:
```java
new HourlyEmployee("Or", "Saban", "123", 50, 160, new DayOfBirth(30, 3, 1999))
-----------
Employee Type: HourlyEmployee
Or Saban
Salary: 8200.0
🎉 Happy Birthday Or! You received a 200₪ bonus! 🎉
-----------
```
## Note
You can download the zip file and extract after that go to the file and click twice on run.bat and it will run on your computer

