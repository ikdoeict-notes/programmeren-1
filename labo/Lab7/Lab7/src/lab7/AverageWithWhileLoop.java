package lab7;

import java.util.Scanner;

public class AverageWithWhileLoop {

    public static void main(String[] args) {
        System.out.println("This program computes the average of");
        System.out.println("a list of (nonnegative) exam scores.");
        double sum;
        int numberOfStudents = 0;
        double next = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter all the scores to be averaged.");
        System.out.println("Enter a negative number after");
        System.out.println("you have entered all the scores.");
        sum = 0;
        numberOfStudents = 0;
        while (next >= 0) {
            System.out.print("Enter a score:");
            next = keyboard.nextDouble();
            sum = sum + next;
            numberOfStudents++;
        }
        if (numberOfStudents > 0) {
            System.out.println("The average is " + (sum / numberOfStudents));
        } else {
            System.out.println("No scores to average.");
        }
    }
}
