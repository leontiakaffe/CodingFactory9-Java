package gr.aueb.cf.cf9.ch17.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5);
		List<Product> products = new ArrayList<>(List.of(
				new Product("Apples", 12.5, 100),
				new Product("Oranges", 8.1, 50),
				new Product("Milk", 2.8, 4),
				new Product("Apples", 22.5, 120)

		));

		products.sort(Comparator.naturalOrder());
		products.forEach(System.out::println);

		products.sort(Comparator.reverseOrder());

		products.sort(Comparator.comparing(Product::getPrice));
		//products.sort((a,b) -> Double.compare(a.getPrice(),b.getPrice()));
		//products.sort((a,b) -> b.getQuantity() - a.getQuantity() );      //Descending
		//products.sort(Comparator.comparing(Product::getQuantity).reversed());	//Descending
		products.sort(Comparator.comparing(Product::getQuantity)
				.thenComparing(Product::getPrice,Comparator.reverseOrder())		//Price Descending
				.thenComparing(Product::getDescription).reversed());

		List<Integer> squares = numbers.stream()
				.map(num -> num * num)			//Intermediate op
				.toList();						//Terminal op
		squares.forEach(System.out::println);

		var listOfDescriptions = products.stream()
				.map(Product::getDescription)
				.toList();

		String listIfDescription2 = products.stream()
				.map(Product::getDescription)
				.collect(Collectors.joining(", "));

		listOfDescriptions.forEach(System.out::println);


	}
}
