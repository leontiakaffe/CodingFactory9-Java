package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει την ηλικία του σε έτη (έστω ακέραιος)
 * και το πρόγραμμα επιστρέφει την ηλικία του σε ημέρες, όπου θεωρούμε
 * 1 έτος = 365 ημέρες. Για παράδειγμα αν δοθεί ηλικία 28 ετών,
 * το αποτέλεσμα είαι 7210 ημέρες.
 */
public class YearsToDays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int DAYS_IN_YEAR = 365;
        int inputAgeinYears = 0;
        int ageIndays = 0;

        System.out.println("Παρακαλώ εισάγετε την ηλικία σας");
        inputAgeinYears = in.nextInt();
        ageIndays = inputAgeinYears * DAYS_IN_YEAR;

        System.out.printf("Ηλικία σε έτη: %d . Ηλικία σε ημέρες: %d\n", inputAgeinYears, ageIndays);

    }
}
