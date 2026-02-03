package gr.aueb.cf.cf9.ch7;

public class StrSplit {

	public static void main(String[] args) {
		String s = "Athens Uni of Eco and Business";
		String[] tokens;

		tokens = s.split(" +");	//ένα ή περισσότερα κενά (κενό και +)

		for (String token : tokens){
			System.out.println(token);
		}
	}
}
