package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισαάγει ένα ακέραιο που συμβολίζει μια θερμοκρασία.
 * και το πρόγραμμα υπολογίζει αν η θερμοκρασία είναι μικρότερη απο το μηδέν
 * τότ μια μεταβλητή γίνεται true αλλίως γίνεται false.
 */

public class TemperatureApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowzero = false;

        System.out.println("Παρακαλώ εισάγεται μια θερμοκρασία");
        temperature = in.nextInt();

        isTempBelowzero = temperature < 0;

        System.out.printf("Η θερμοκρασία είναι μικρότερη απο μηδέν:%b%n" ,isTempBelowzero );


    }
}
