package gr.aueb.cf.cf9.ch6;

/**
 * Όταν κάνουμε copy references, τότε
 * το copy οναμάζεται shallow και έχει
 * side effects.
 */
public class ArrayShallowCopy {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[] arrCopy = arr; //Αντιγραφή δείκτη , αλλάζει και τα περιεχόμενα και των δυο(SWALLOW COPY)


		arrCopy[0] = 1000;
		System.out.println(arr[0]);

	}




}
