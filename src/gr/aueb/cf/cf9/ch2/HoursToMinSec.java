package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

public class HoursToMinSec {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int SECONDS = 3600;
        final int MINUTES = 60;
        int inputHours = 0;
        int hoursTominutes = 0;
        int hoursToseconds = 0;

        System.out.println("Παρακαλώ πολύ εισάγεται ώρες");
        inputHours = in.nextInt();
        hoursTominutes = inputHours * SECONDS ;
        hoursToseconds = inputHours * MINUTES;

        System.out.printf("Οι %d ώρες είναι %,d σε λεπτά και %,d σε δευτερόλεπτα", inputHours, hoursTominutes , hoursToseconds);
    }
}
