# Employee Attendance Tracker

## Overview
The Employee Attendance Tracker is a Java-based application designed to manage and track the attendance of employees over a week. It allows for the creation of employee records, marking of attendance for each day of the week, and generation of weekly and overall attendance reports.

## Features
- Add new employees with unique IDs and names.
- Mark attendance for each day of the week.
- Display weekly attendance for individual employees.
- Generate weekly attendance reports for individual employees.
- Generate an overall attendance report for all employees.

## Classes

### Employee
- Manages individual employee data and attendance.
- Methods:
  - `addEmployee()`: Adds a new employee.
  - `markAttendance(String dayOfWeek)`: Marks attendance for a specific day.
  - `displayAttendance()`: Displays the attendance for the week.
  - `generateWeeklyReport()`: Generates a weekly attendance report.

### AttendanceReport
- Generates overall attendance reports for all employees.
- Methods:
  - `generateOverallReport(Employee[] employees)`: Generates an overall attendance report.

## Usage
1. Run the `Employee` class.
2. Enter the number of employees to create.
3. For each employee, enter the name and ID.
4. Optionally, mark attendance for each day of the week.
5. After all employees are created, an overall attendance report will be generated.
