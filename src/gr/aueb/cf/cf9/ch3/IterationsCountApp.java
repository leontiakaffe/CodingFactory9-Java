package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Count the number of iterations.
 * When the user inserts -1, the
 * while-do loop will stop
 */
public class IterationsCountApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        int iteration = 0;

        System.out.println("Please enter a number");
        num = in.nextInt();

        while (num != -1){
            iteration++;
            System.out.println("Please enter a number");
            num = in.nextInt();
        }

        System.out.println("The count of iteration is: " + iteration);
    }
}
