package gr.aueb.cf.cf9.review.junior_level;

/**
 *	 Οι μεταβλητές a, m δεν είναι 'καλά' ονόματα
 *   Ο κώδικας θα μπορούσε να είναι μέθοδος
 *   Δεν έχει documentation
 *   Δεν υπάρχει έλεγχος για κενό array
 *   Δεν έχει δομή
 *   Δεν έχει SoC
 */
public class ArrayMax {

	public static void main(String[] args) {
		int[] num = { 1, 3, 6, 10, 30, 12, 4};

		int m = num[0];

		for (int i = 1; i < num.length; i++) {
			if (num[i] > m) {
				m = num[i];
			}
		}
		System.out.println(m);
	}


}
