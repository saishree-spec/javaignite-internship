package day8assignments;

public class CompanySalesDashboard {
	    public static void main(String[] args) {
	        int[][] sales = {
	            {1000, 1200, 1100, 1300}, // Branch 1
	            {1500, 1400, 1600, 1700}, // Branch 2
	            {900, 1000, 950, 1100}    // Branch 3
	        };

	        int overallSales = 0;
	        int highestSales = 0;
	        int topBranch = 0;
	        for (int i = 0; i < sales.length; i++) {
	            int branchTotal = 0;

	            for (int j = 0; j < sales[i].length; j++) {
	                branchTotal += sales[i][j];
	            }

	            System.out.println("Total Sales of Branch " + (i + 1) + ": " + branchTotal);

	            overallSales += branchTotal;

	            if (branchTotal > highestSales) {
	                highestSales = branchTotal;
	                topBranch = i + 1;
	            }
	        }

	        System.out.println("Overall Company Sales: " + overallSales);
	        System.out.println("Branch with Highest Sales: Branch " + topBranch);
	    }

}
