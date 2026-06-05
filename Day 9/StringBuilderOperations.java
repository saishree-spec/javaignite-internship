package day9assignments;
import java.util.Scanner;
public class StringBuilderOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        sb.append(" Programming");
        System.out.println("After Append: " + sb);
        int middle = sb.length() / 2;
        sb.insert(middle, " Easy ");
        System.out.println("After Insert: " + sb);
        int start = sb.indexOf("Easy");
        int end = start + "Easy".length();
        sb.replace(start, end, "Powerful");
        System.out.println("After Replace: " + sb);
        sb.reverse();
        System.out.println("After Reverse: " + sb);

        sc.close();
    }
}