package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * ο χρήστης προσπαθεί να μαντέψει τον μυστικό αριθμό.
 */
public class SecretApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET_NUMBER = 42;
        int num = 0;

        System.out.println("Παρακαλώ πολύ μάντεψε τον μυστικό αριθμό:");
        num = in.nextInt();

        if (num != SECRET_NUMBER){
            System.out.println("Λυπάμαι πολύ , μάντεψες λάθος.");
        }else {
            System.out.println("Συγχαρητήρια! Μάντεψες σωστά!");
        }
    }
}
