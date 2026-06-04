package day8assignments;

public class AttendanceTracker {
	    public static void main(String[] args) {

	        int[] attendance = {1, 1, 0, 1, 1, 0, 1, 0, 1, 1};

	        int present = 0;
	        int absent = 0;

	        for (int i = 0; i < attendance.length; i++) {
	            if (attendance[i] == 1) {
	                present++;
	            } else {
	                absent++;
	            }
	        }

	        double attendancePercentage = (present * 100.0) / attendance.length;

	        System.out.println("Total Present Students: " + present);
	        System.out.println("Total Absent Students: " + absent);
	        System.out.println("Attendance Percentage: " + attendancePercentage + "%");
	    }

}
