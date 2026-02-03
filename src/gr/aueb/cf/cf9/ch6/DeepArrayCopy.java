package gr.aueb.cf.cf9.ch6;

/**
 * Defensive Array Copy. Deep Copy.
 * Fresh Copy of the array.
 */
public class DeepArrayCopy {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[] arrCopy = arr; //Αντιγραφή δείκτη , αλλάζει και τα περιεχόμενα και των δυο(SWALLOW COPY)

		arrCopy = getArrayDeepCopy(arr);

		arrCopy[0] = 1000;
		System.out.println(arr[0]);

	}

	public static int[] getArrayDeepCopy(int[] arr){
		int[] destArr = new int[arr.length]; //Δημιουργούμε νέο χώρο στο heap και αντιγράφουμε τις τιμές

		//Contents of arr are copied to destArr
		for (int i = 0; i < arr.length; i++){
			destArr[i] = arr[i];
		}

		return destArr;
	}


}
