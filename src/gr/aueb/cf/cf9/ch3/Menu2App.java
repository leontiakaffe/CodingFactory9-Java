package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού μέχρι ο χρήστης
 *   να επιλέξει 'Exit'.(τον αριθμό 3)
 */
public class Menu2App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Παρακαλώ επιλέξτε ένα από τα παρακάτω:");
            System.out.println("1.Εισαγωγή Αίτησης");
            System.out.println("2.Διαγραφή Αίτησης");
            System.out.println("3.Έξοδος");
            choice = in.nextInt();

            if (choice == 3){
                break;
            }
        }

        System.out.println("Ευχαριστώ που χρησιμοποιήσατε το πρόγραμμα");

    }
}
