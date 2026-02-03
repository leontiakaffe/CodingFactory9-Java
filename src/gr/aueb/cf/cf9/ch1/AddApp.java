package gr.aueb.cf.cf9.ch1;

/**
 * Sums two integers and appears the result
 * in the console
 */
public class AddApp {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 5;
        int num2 = 10;
        int result = 0;

        //εντολές
        result = num1 + num2;

        //εκτύπωση αποτελέσματος
        System.out.println("Το αποτέλεσμα είναι : " + result);
        System.out.println("Το άθροισμα των:" + num1 + "," + num2 + "είναι" + result);
        System.out.printf(" Το άθροισμα των : %,d , %,d είναι: %d" ,num1, num2, result);
    }
}
