package gr.aueb.cf.cf9.ch7;

/**
 * Δήλωση και αρχικοποίηση (populate)
 * ενός {@link String} με ctrl + click στο String
 * παραπμπουμε στην κλάση
 */
public class StrInit {

	public static void main(String[] args) {
		String s = "Athens";						//popular
		String s1 = new String("Athens");	//not popular
		String s3 ="";
		String s4 = null;
		boolean isEmpty;

		//isEmpty = s3.length() == 0;
		isEmpty = s3.isEmpty();

		System.out.println(s);
		System.out.println("length:" + s.length());
		System.out.printf("City: %s\n", s);
	}
}
