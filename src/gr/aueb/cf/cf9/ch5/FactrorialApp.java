package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του n,
 * με μεθοδο . To n!  1 * 2 * 3 * 4 * ... n
 * Καθ 0! = 1
 */
public class FactrorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int factorial = 0;

        System.out.println("Please enter a number");
        num = in.nextInt();

        factorial = facto(num);

        System.out.println("The factorial of " + num + " is " + factorial);
    }

    /**
     * Calculates the factorial of n.
     * @param n the number to calculate factorial of.
     * @return  the factorial of n.
     */
    public static int facto (int n){
        int factorial = 1;

        for (int i = 1; i <= n; i++){
            factorial *= i;
        }

        return factorial;
    }

}
