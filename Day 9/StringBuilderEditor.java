package day9assignments;

public class StringBuilderEditor {
	    public static void main(String[] args) {
	        StringBuilder sb = new StringBuilder("Java");
	        System.out.println("Start: " + sb);
	        sb.append(" Programming");
	        System.out.println("After Insert: " + sb);
	        sb.delete(0, 4);
	        System.out.println("After Delete: " + sb);
	        sb.deleteCharAt(0);
	        sb.replace(0, sb.length(), "Coding");
	        System.out.println("After Replace: " + sb);
	        sb.reverse();
	        System.out.println("After Reverse: " + sb);
	    }
}
