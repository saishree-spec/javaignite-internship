
public class Student {
	    String name;
	    int age;
	    private int marks;

	    
	    Student(String name, int age, int marks) {
	        this.name = name;
	        this.age = age;
	        this.marks = marks;
	    }

	
	    void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Marks: " + marks);
	        System.out.println();
	    }
	}

	public class Main {
	    public static void main(String[] args) {

	        Student s1 = new Student("Shree", 20, 85);
	        Student s2 = new Student("Rahul", 21, 92);

	        s1.displayDetails();
	        s2.displayDetails();
	    }
	}

}
