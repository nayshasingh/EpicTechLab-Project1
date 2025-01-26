public class AttendanceReport {
    public static void generateOverallReport(Employee[] employees){
        StringBuilder report = new StringBuilder();
        report.append("Overall Attendance Report for all Employees\n");
        report.append("===================================================================");
        System.out.println(report.toString());
        for(Employee emp : employees){
            emp.generateWeeklyReport();
        }
        report.setLength(0);
        report.append("Summary\n");
        report .append("Total present days : ").append(Employee.totalPresent).append("\n");
        report.append("Total absent days : ").append(Employee.totalAbsent).append("\n");
        System.out.println(report.toString());
    }
}
