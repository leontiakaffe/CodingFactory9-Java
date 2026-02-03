package gr.aueb.cf.cf9.ch17.enums;

public class Main {

	public static void main(String[] args) {
		UserRole role = UserRole.ADMIN;

		String roleAdmin = role.name();   // Επιστρέφει το ADMIN σαν String.
		System.out.println("role: " + roleAdmin + ", ordinal: " + role.ordinal());

		UserRole roleUser = UserRole.valueOf(roleAdmin);	//Κάνει typecast στο enum. Το αντίθετο δηλαδή που κάνει το role.name()

		for (UserRole r : UserRole.values()){
			System.out.println(r.ordinal() + " , " + r.name());
		}
	}
}
