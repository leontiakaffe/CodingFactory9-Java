package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει δυο τιμές, αριθμητή και παρανομαστή και\
 * το πρόγραμμα υπολογίζει το πηλίκο, επαναληπτικά.
 * Αν ο αριθμητής είναι 0 τότε το πρόγραμμα διακόπτεται.
 * Αν ο παρανομαστής είναι 0, τότε η διαδικασία επαναλαμβάνεται.
 */
public class DivisionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int denominator = 0;
        int numerator = 0;
        int result = 0;


        while (true){
            System.out.println("Παρακαλώ πολύ εισάγεται αριθμητή:");
            numerator = in.nextInt();

            if (numerator == 0){
                System.out.println("ο αριθμητής είναι 0 ");
                break;
            }

            System.out.println("Παρακαλώ πολύ εισάγεται παρανομαστή:");
            denominator= in.nextInt();

            if (denominator == 0){
                System.out.println("Δεν γίνεται να διαιρεθεί με το 0.");
                continue;
            }

            result = numerator / denominator;
            System.out.println("Αποτέλεσμα:" + result);
        }


    }
}
