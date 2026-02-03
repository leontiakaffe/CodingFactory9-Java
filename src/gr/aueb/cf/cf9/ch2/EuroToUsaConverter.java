package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει απο τον χρήστη ένα ποσό (ακέραιος)
 * σε ευρώ και το μετατρέπει σε δολάρια USA
 * με βάση μια ισοτιμία. π.χ αν ο χρήστης δώσει 100 ευρω και η
 * ισοτιμία είναι 1 ευρώ = 99 usa cents, τότε συνολικά τα usa cents είναι 9900
 * και αυτο αντιστοιχεί σε 99 usa dollars και 8 usa cents,
 */
public class EuroToUsaConverter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int euro = 0;
        final int EURO_TO_USA_CONVERSION_RATE = 99;
        int euroToCents = 0;
        int euroTodollars = 0;
        int totalCents = 0 ;

        System.out.println("Παρακαλώ πολύ εισάγεται ένα ποσό σε ευρώ!");
        euro = in.nextInt();

        totalCents = euro * EURO_TO_USA_CONVERSION_RATE;
        euroTodollars = totalCents / 100;
        euroToCents = totalCents % 100;

        System.out.printf(" Τα %d ευρώ είναι %d δολάρια και %d cents" , euro , euroTodollars , euroToCents);

    }
}
