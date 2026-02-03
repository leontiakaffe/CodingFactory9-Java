package gr.aueb.cf.cf9.ch6;

/**
 * Traverse an array. Διάσχιση, επίσκεψη
 * και εκτύπωση
 */
public class ArrayTraverse {

	public static void main(String[] args) {
		int[] arr1 = new int [4];
		int[] grades = {10, 9, 8, 6};
		int[] scores = new int[] {100, 90, 80, 70};

		//Traverse
		for (int i = 0; i < arr1.length; i++){
			System.out.println(arr1[i]);
		}

		for (int i = 0; i <grades.length; i++){
			System.out.println(grades[i]);
		}

		for (int i = 0; i <scores.length; i++){
			System.out.println(grades[i]);
		}

		//Enhanced for
		for (int grade : grades){
			System.out.println(grade);
		}

		for (int arr : arr1){
			System.out.println(arr);
		}
	}

}
