package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculates factorial of a number.
 * n! = 1* 2 *3 ....* n
 * For instance 5! = 1 * 2 *3 * 4 * 5 =120
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int i = 1;
        int factorial = 1;

        System.out.println("Παρακαλώ πολυ εισάγεται αριθμό");
        num = in.nextInt();

        while (i <= num){
            factorial *= i;
            i++;

        }

        System.out.printf("%d! = %d%n", num, factorial);

    }



}
