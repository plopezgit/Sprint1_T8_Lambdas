package n1Exe3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List <String> words = 
				new ArrayList<>(Arrays.asList("January", "February", "March", "April", "May", "June", "July",
						"August", "September", "October", "November", "December"));
		
		words.forEach(word -> System.out.println(word));
	}
	
	/*
	 * Crea una lista con los nombres de los meses del año. 
	 * Imprime todos los elementos de la lista con una lambda.
	 */

}
