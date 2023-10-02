package n1Exe4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReferenceSample {

	public static void main(String[] args) {

		List <String> words = 
				new ArrayList<>(Arrays.asList("January", "February", "March", "April", "May", "June", "July",
						"August", "September", "October", "November", "December"));
		
		words.forEach(System.out::println);
		
		//o//
		
		PrintableList<String> list = System.out::println;
		list.print(words);

	}


	/*
	 * Realizar la misma impresión del punto anterior, pero mediante method reference.
	 */

}
