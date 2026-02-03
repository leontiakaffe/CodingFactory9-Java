package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει τα base και power και το πρόγραμμα
 * υπολογίζει το base^power, π.χ 2^10 = 1024.
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = 0;
        int power =0;
        int result = 1;

        System.out.println("Παρακαλώ πολύ εισάγεται το base και το power");
        base = in.nextInt();
        power = in.nextInt();

        for (int i=1; i <= power; i++){
            result *= base;
        }

        System.out.printf(" %d ^ %d = %d%n", base , power , result );
    }
}
