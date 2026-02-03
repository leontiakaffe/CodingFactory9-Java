package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Count the number of positive numbers.
 * How many loops will be needed is a decision that
 * happens at runtime.
 */
public class PositivesCountApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int positives = 0;

        System.out.println("Please enter a number:");
        num = in.nextInt();

        //Διαβάζει μέχρι να βρει αρνητικό ακέραιο (sentinel)
        while (num >= 0){
            positives++;
            System.out.println("Please enter a number:");
            num = in.nextInt();
        }

        System.out.println("the count of positive number is :" + positives);

    }
}
