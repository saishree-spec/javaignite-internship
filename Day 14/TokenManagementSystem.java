package day14;
import java.util.LinkedList;
import java.util.Queue;
public class TokenManagementSystem {
    public static void main(String[] args) {
        Queue<String> patientQueue = new LinkedList<>();
        patientQueue.offer("Arun");
        patientQueue.offer("Priya");
        patientQueue.offer("Ravi");
        patientQueue.offer("Meena");
        patientQueue.offer("Karthik");
        System.out.println("Patients Waiting in Queue:");
        System.out.println(patientQueue);
        String servedPatient = patientQueue.poll();
        System.out.println("\nPatient Being Served:");
        System.out.println(servedPatient);
        System.out.println("\nRemaining Patients in Queue:");
        System.out.println(patientQueue);
    }
}