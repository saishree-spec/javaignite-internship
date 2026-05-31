package day5assignments;
import java.util.Scanner;
public class battle_arena_winner {
	 public static String findWinner(int player1Score, int player2Score) {

	        if (player1Score > player2Score) {
	            return "Player 1 Wins";
	        } else if (player2Score > player1Score) {
	            return "Player 2 Wins";
	        } else {
	            return "Match Draw";
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Player 1 Score: ");
        int player1 = sc.nextInt();

        System.out.print("Enter Player 2 Score: ");
        int player2 = sc.nextInt();

        String result = findWinner(player1, player2);

        System.out.println(result);

        sc.close();

	}

}
