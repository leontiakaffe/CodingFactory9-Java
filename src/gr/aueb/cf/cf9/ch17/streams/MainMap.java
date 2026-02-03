package gr.aueb.cf.cf9.ch17.streams;

import java.util.List;

public class MainMap {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5);
		List<Integer> squares = numbers.stream()
				.map(num -> num * num)			//Intermediate op
				.toList();						//Terminal op
		squares.forEach(System.out::println);
	}
}
