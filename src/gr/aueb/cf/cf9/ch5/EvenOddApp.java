package gr.aueb.cf.cf9.ch5;

import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * Ορίζει δυο μεθόδους, τις isEven και isOdd για τον
 * έλεγχο ενός ακεραίου ανα είναι άρτιος ή περιτός
 */
public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        boolean isEven = true;

        System.out.println("Παρακαλώ πολυ εισάγεται έναν αριθμό");
        num = in.nextInt();

        isEven = isEven(num);

        if (isEven){
            System.out.println(num + " is even");
        }else {
            System.out.println(num + " is odd");
        }
    }

    public static boolean isEven( int num){
        return num % 2 == 0;
    }

    public static boolean isOdd( int num){
        //return num % 2 != 0;
        return !isEven(num);
    }
}
