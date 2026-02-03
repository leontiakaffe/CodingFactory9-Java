package gr.aueb.cf.cf9.review.challenges;

/**
 * Η κρυπτογράφηση βασίζεται στη μετατροπή χαρακτήρων σε ακεραίους.
 */
public class CryptographyApp {

	public static void main(String[] args) {

	}

	public static String cipher(String s, int key){
		int prevCipher;
		int cipher;
		StringBuilder cipherArray = new StringBuilder();

		prevCipher = s.charAt(0);
		cipherArray.append(prevCipher);
		cipherArray.append(" ");

		for (int i =0; i < s.length(); i++){
			if (s.charAt(i) == '#'){
				cipherArray.append("-1");
				break;
			}
			cipher = (s.charAt(i) + prevCipher ) % key;
			cipherArray.append(cipher);
			cipherArray.append(" ");
			prevCipher = cipher;
		}

		return cipherArray.toString();
	}

	public static String decipher(String s, int key){
		StringBuilder decipherArray = new StringBuilder();
		String[] tokens = s.split(" ");
		int prevCipher = Integer.parseInt(tokens[0]);
		int cipher = 0;

		prevCipher = s.charAt(0);
		decipherArray.append(prevCipher);
		decipherArray.append(" ");

		for (int i =0; i < s.length(); i++){
			if (s.charAt(i) == '#'){
				decipherArray.append("-1");
				break;
			}
			cipher = (s.charAt(i) + prevCipher ) % key;
			decipherArray.append(cipher);
			decipherArray.append(" ");
			prevCipher = cipher;
		}

		return decipherArray.toString();
	}
}
