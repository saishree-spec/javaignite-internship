package day8assignments;

public class ConsecutiveIncreaseChecker {
	    public static void main(String[] args) {

	        int[] numbers = {10, 20, 30, 40, 50};

	        boolean increasing = true;

	        for (int i = 0; i < numbers.length - 1; i++) {
	            if (numbers[i] >= numbers[i + 1]) {
	                increasing = false;
	                break;
	            }
	        }

	        if (increasing) {
	            System.out.println("Array is in increasing order");
	        } else {
	            System.out.println("Array is NOT in increasing order");
	        }
	}

}
