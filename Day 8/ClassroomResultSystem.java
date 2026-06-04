package day8assignments;

public class ClassroomResultSystem {
	    public static void main(String[] args) {

	        int[] marks = {78, 45, 23, 67, 34, 89, 56, 12, 40, 71};

	        int passed = 0;
	        int failed = 0;

	        for (int i = 0; i < marks.length; i++) {
	            if (marks[i] >= 35) {
	                passed++;
	            } else {
	                failed++;
	            }
	        }

	        System.out.println("Passed Students: " + passed);
	        System.out.println("Failed Students: " + failed);
	    }

}
