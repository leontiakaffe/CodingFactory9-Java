package gr.aueb.cf.cf9.ch2;

/**
 * The user inserts thw weight in kilograms and the program
 * calculates thw weight in grams.
 */

import java.util.Scanner;

public class KiloToGrams {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputKilo = 0;
        final int GRAMS = 1000;


        System.out.println(" Παρακαλώ πολύ εισάγεται τα κιλά σας ");
        inputKilo = in.nextInt();
        int result = inputKilo * GRAMS;

        System.out.printf(" Τα %d κιλά είναι %,d γραμμάρια", inputKilo , result);

    }
}
