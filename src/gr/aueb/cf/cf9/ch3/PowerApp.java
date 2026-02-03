package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculates the power of a number.
 * a^n = a * a * a * a.....* a (n times)
 * base^power = base * base * base * base... * base (power times)
 */

public class PowerApp {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση δεδομένων
        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        //Είσοδος δεδομένων και ανιστοίχιση σε μεταβλητές
        System.out.println("Παρακαλώ εισάγετε το base και το power:");
        base = in.nextInt();
        power = in.nextInt();

        //Επεξεργασία δεδομένων - while -do
        while (i <= power) {
            result *= base;  // result = result * base
            i++;
        }

        //Εκτύπωση αποτελέσματος
        System.out.printf("%d ^ %d = %d%n", base ,power ,result);

    }
}
