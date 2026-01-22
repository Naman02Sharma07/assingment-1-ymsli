package Assingments.ass1;
import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int number_of_studentes = sc.nextInt();
        if(number_of_studentes == 0){
            System.out.println("No students. Cannot calculate average.");
            return;
        }
        int grades[] = new int[number_of_studentes];
        int sum = 0;
        for(int i = 0; i < number_of_studentes; i++) {
            while (true) {
                System.out.print("Enter grade for student " + (i + 1) + ": ");
                int grade = sc.nextInt();
                if (grade < 0 || grade > 100) {
                    System.out.println("Invalid grade. Try again.");
                } else {
                    grades[i] = grade;
                    sum += grade;
                    break;
                }
            }
        }

        double average = (double) sum / number_of_studentes;
        System.out.println("Average: " + average);
        sc.close();
    }
}
