package gr.aueb.cf.cf9.ch3;

/**
 * The user inserts a temperature in celcius,
 * and the status of isRaining variable and calculates
 * if it is snowing, if it is raining and the temperature is below zero, it is snowing.
 */

import java.util.Scanner;

public class SnowingApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int temperature = 0;
        boolean isRaining = true;
        boolean isSnowing = true;

        System.out.println("Παρακαλώ εισάγεται αν βρέχει (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Παρακαλώ εισάγεται θερμοκρασία");
        temperature = in.nextInt();

        isSnowing = isRaining && (temperature < 0);

        System.out.printf("Is snowing : %b%n", isSnowing);
    }
}
