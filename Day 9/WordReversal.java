package day9assignments;
import java.util.Scanner;
public class WordReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String rev = "";
            for (int j = words[i].length() - 1; j >= 0; j--) {
                rev += words[i].charAt(j);
            }
            System.out.print(rev + " ");
        }
        sc.close();
    }
}