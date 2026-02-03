package gr.aueb.cf.cf9.ch6;

/**
 *Array Initialization 1.
 */
public class ArrayInit2 {

	public static void main(String[] args) {
		int[] arr ={ 1, 5, 3, 44, 5, 23, 7, 8, 95, 18 }; //unsized array initialization.(υπονοείται η new, ακόμα και αν δε γράφετε)

		System.out.println(arr[0]);					//first element
		System.out.println(arr.length);				// array lenght
		System.out.println(arr[arr.length - 1]);    //last element
	}
}
