package day6assignments;

public class Batsman {
	  String playerName;
	    int runs;
	    int balls;
	    double strikeRate;

	    Batsman(String playerName, int runs, int balls) {
	        this.playerName = playerName;
	        this.runs = runs;
	        this.balls = balls;

	        strikeRate = (runs * 100.0) / balls;
	    }

	    void display() {
	        System.out.println("Player Name: " + playerName);
	        System.out.println("Runs: " + runs);
	        System.out.println("Balls: " + balls);
	        System.out.println("Strike Rate: " + strikeRate);
	    }

	    public static void main(String[] args) {
	        Batsman b1 = new Batsman("Gill", 75, 50);
	        b1.display();
	    }
	
}

	
