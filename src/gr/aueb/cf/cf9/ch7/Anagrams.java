package gr.aueb.cf.cf9.ch7;

public class Anagrams {

	public static void main(String[] args) {

	}

	public static boolean isAnagram(String s1,String s2){
		if (s1.length() != s2.length()) return false;

		int[] frequency = new int[256];		//full ascii - default value is 0

		for (char s : s1.toCharArray()){
			frequency[s]++;

		}

		for (char c : s2.toCharArray()){
			frequency[c]--;
			if (frequency[c] < 0) return false;		//early exit
		}
			//All counts are 0

		for (int item : frequency){
			if (item != 0) return false;
		}
		return true;
	}
}
