package gr.aueb.cf.cf9.ch2;

//import java.lang.*;
import java.util.Scanner;

/**
 * Διαβάζει δυο ακεραίους απο το stdin(standard input, πληκτρολόφιο δηλαδή)
 * και υπολογίζει το αποτέλεσμα.
 */
public class AddScannerApp {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        //Εντολές
        System.out.println("Παρακαλώ εισάγετε δυο ακεραίους");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("Το άθροισμα των %d και %d είναι ίσο με %d%n" , num1 , num2, sum);
    }
}
