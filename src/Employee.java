import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Employee {
    int employeeId;
    String name;
    boolean[] attendance = new boolean[7];
    public static int totalPresent = 0;
    public static int totalAbsent = 0;
    public void addEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        this.name = sc.nextLine();
        System.out.println("Enter the employee id");
        this.employeeId = sc.nextInt();
        System.out.println("Employee " + this.name + " - " + this.employeeId +" created successfully");
        System.out.println("===================================================================");

    }

//    public void markAttendance(int dayOfWeek){
//        if(dayOfWeek < 1 || dayOfWeek > 7){
//            System.out.println("Invalid day of the week. Please enter a value between 1 and 7.");
//            return;
//        }
//        this.attendance[dayOfWeek-1] = true;
//    }

    public void markAttendance(String dayOfWeek){
        Map<String, Integer> days = new HashMap<>();
        days.put("monday", 0);
        days.put("tuesday", 1);
        days.put("wednesday", 2);
        days.put("thursday",3);
        days.put("friday",4);
        days.put("saturday",5);
        days.put("sunday",6);

        if(!days.containsKey(dayOfWeek)){
            System.out.println("Invalid day of the week. Please enter a valid day of the week.");
            return;
        }
        this.attendance[days.get(dayOfWeek)] = true;
    }
    public void displayAttendance(){
        System.out.println("Attendance of employee in a given week");
        for(int i=0;i<7;i++){
            if(this.attendance[i] == true){
                System.out.println("Day " +(i+1)+" - Present");
            }
            else{
                System.out.println("Day " +(i+1)+" - Absent");
            }
        }
        System.out.println("===================================================================");
    }

    public void generateWeeklyReport() {
        StringBuilder report = new StringBuilder();
        report.append("Weekly report for ");
        int presentDays = 0, absentDays = 0;
        report.append("Employee name - ").append(this.name).append(" Employee id - ").append(this.employeeId).append("\n");
        for (boolean day : this.attendance) {
            if (day) {
                presentDays++;
                totalPresent++;
            } else {
                absentDays++;
                totalAbsent++;
            }
        }
        report.append("Present days : ").append(presentDays).append("\n");
        report.append("Absent days : ").append(absentDays).append("\n");
        report.append("===================================================================\n");
        System.out.println(report.toString());
    }

    public static void main(String[] args){
        System.out.println("How many employees do you wish to create ?");
        Scanner sc = new Scanner(System.in);
        Integer number = sc.nextInt();
        sc.nextLine();
        Employee[] employees = new Employee[number];
        for(int i=0;i<number;i++){
            System.out.println("Creating employee "+ (i+1));
            employees[i]= new Employee();
            employees[i].addEmployee();
            System.out.println("Do you wish to mark attendance for this employee? (y/n)");
            String choice = sc.nextLine();
            if(choice.equals("y")){
                System.out.println("Enter the day of the week to mark attendance(monday, tuesday, wednesday, thursday, friday, saturday, sunday)");
                System.out.println("Enter 'exit' to stop marking attendance");
                while(true){
                    String dayOfWeek = sc.nextLine();
                    if(dayOfWeek.equals("exit")){
                        break;
                    }
                    employees[i].markAttendance(dayOfWeek);
                }
                System.out.println("===================================================================");
            }
        }

        AttendanceReport.generateOverallReport(employees);

//        emp.markAttendance(1);
//        emp.markAttendance(4);

//        emp.displayAttendance();
//        emp.generateWeeklyReport();

    }

}
