package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψηφείων ενός ακεραίου.
 * Για παραδειγμα αν ο ακέραιος είναι ο 178 , το πλήθος των ψηφίων είναι 3.
 */
public class DigitsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int digits = 0;
        int inputNum = 0;

        System.out.println("Please insert a number");
        num = in.nextInt();

        inputNum = num;  //save the input number for later use
       do {
           digits++;
           num /= 10; // num = num / 10;
       }while (num > 0);

        System.out.println(" the number of digits of: " + inputNum +" is:" + digits);


    }
}
