package day13;
import java.util.ArrayList;
import java.util.HashMap;

class Student {
    String name;
    String course;
    int marks;

    Student(String name, String course, int marks) {
        this.name = name;
        this.course = course;
        this.marks = marks;
    }
}

public class StudentCoursePerformance {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("Rahul", "Java", 85));
        list.add(new Student("Priya", "Java", 90));
        list.add(new Student("Amit", "Python", 80));
        list.add(new Student("Neha", "Python", 70));
        list.add(new Student("Riya", "DBMS", 95));
        list.add(new Student("Karan", "DBMS", 85));
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();

        // Group marks by course
        for (Student s : list) {
            String course = s.course;
            int marks = s.marks;

            if (map.containsKey(course)) {
                ArrayList<Integer> marksList = map.get(course);
                marksList.add(marks);
            } else {
                ArrayList<Integer> marksList = new ArrayList<>();
                marksList.add(marks);
                map.put(course, marksList);
            }
        }
        String topCourse = "";
        double highestAverage = 0;

        System.out.println("Average Marks for Each Course:");

        for (String course : map.keySet()) {

            ArrayList<Integer> marksList = map.get(course);

            int sum = 0;

            for (int i = 0; i < marksList.size(); i++) {
                sum = sum + marksList.get(i);
            }

            double average = (double) sum / marksList.size();

            System.out.println(course + " : " + average);

            if (average > highestAverage) {
                highestAverage = average;
                topCourse = course;
            }
        }

        System.out.println("\nCourse with Highest Average:");
        System.out.println(topCourse + " : " + highestAverage);
    }
}