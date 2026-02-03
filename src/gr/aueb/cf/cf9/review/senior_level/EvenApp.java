package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * Δέχεται μια τιμή (integer) και εκτυπώνει στην κονσόλα
 * αν ο αριθμός είναι άρτιος(even) ή περιττός (odd)
 */
public class EvenApp {

	public static void main(String[] args) {
		//Δήλωση και Αρχικοποίηση μεταβλητών
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		boolean result =  true;

		//Είσοδος δεδομένων, validation και data binding
		System.out.println("Παρακαλώ γράψτε έναν αριθμό");
		while (!scanner.hasNextInt()){
			System.out.println("Μπορείτε να εισάγεται μόνο ακέραιο");
			scanner.nextLine();
		}
		num = scanner.nextInt();

		//Επιχειρησιακή λογική - παραστάσεις
		result = isEven(num);

		//Εκτύπωση του αποτελέσματος
		System.out.println("The number is even " + result);
	}

	/**
	 * Μας λέει αν ο αριθμός είναι άρτιος
	 * @param number  δέχεται έναν ακέραιο
	 * @return επιστρέφει αλήθεια αν είναι άρτιος ο αριθμός
	 */
	public static boolean isEven(int number){
		return number % 2 ==0;
	}

}
