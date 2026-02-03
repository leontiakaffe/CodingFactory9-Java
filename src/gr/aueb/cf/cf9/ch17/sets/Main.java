package gr.aueb.cf.cf9.ch17.sets;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<String> bag = new HashSet<>();

		//add - No duplicates
		bag.add("Apple");
		bag.add("Banana");
		bag.add("Orange");
		bag.add("Apple");		//No duplicates allowed

		if (bag.contains("Apple")){		//override equals && hashCode
			bag.remove("Apple");
		}else {
			System.out.println("Apple not included in the bag.");
		}

		bag.removeIf(item -> item.startsWith("B"));
		bag.forEach(System.out::println);

	}
}
