package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει τη δύναμη a^b με μέθοδο
 */
public class PowerMethodApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 0;

        System.out.println("Παρακαλώ πολύ εισάγεται το base και το power:");
        base = in.nextInt();
        power = in.nextInt();

        result = power(base,power);

        System.out.printf("%d ^ %d = %d" , base, power, result);
    }

    /**
     * Calculates a^b
     * @param base  the base
     * @param power   the exponent
     * @return       the result.
     */
    public static int power(int base, int power){
        int result = 0;

        for (int i = 1; i <= power; i++ ){
            result = base * i;
        }

        return result;
    }
}
