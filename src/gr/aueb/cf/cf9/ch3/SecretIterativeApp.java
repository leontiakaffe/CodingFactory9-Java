package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει επαναληπτικά ακεραίους και
 * προσπαθεί να μαντέψει το Secret.
 */
public class SecretIterativeApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET = 42;
        int num = 0;

        while (true){
            System.out.println("Please guess the secret number:");
            num = in.nextInt();

         //   if (num == SECRET){
          //      System.out.println("You guessed the secret number!");
          //      break;
         //   }else {
          //      System.out.println("Try Again!!");
          //  }

            if (num != SECRET){
                System.out.println("Try Again!");
                continue;
            }
            System.out.println("You guessed the secret number!");
            break;

        }
    }
}
