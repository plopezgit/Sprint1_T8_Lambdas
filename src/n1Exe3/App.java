package n1Exe3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import n1Exe2.FilterableList;

public class App {

	public static void main(String[] args) {
		
		List <String> words = new ArrayList<>();
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
		
		words.forEach(word -> System.out.println(word));

	}
	
	/*
	 * Crea una lista con los nombres de los meses del año. 
	 * Imprime todos los elementos de la lista con una lambda.
	 */

}
