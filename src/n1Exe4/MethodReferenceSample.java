package n1Exe4;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceSample {

	public static void main(String[] args) {

		List<String> words = new ArrayList<>();
		words.add("January");
		words.add("February");
		words.add("March");
		words.add("April");
		words.add("May");
		words.add("June");
		words.add("July");
		words.add("August");
		words.add("September");
		words.add("October");
		words.add("November");
		words.add("December");
		
		words.forEach(System.out::println);
		
		//o//
		
		PrintableList<String> list = System.out::println;
		list.print(words);
		
		

	}


	/*
	 * Realizar la misma impresión del punto anterior, pero mediante method reference.
	 */

}
