package n1Exe7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<>(Arrays.asList("Lorem ipsum dolor sit amet",
				"Lorem ipsum dolor sit amet consectetur adipiscing elit", "Lorem ipsum",
				"Lorem", "L", 1111111, 11, 1111));
		
		Collections.sort(list, (o1, o2) -> o2.toString().compareTo(o1.toString()));
		
	}
	
	/*
	 * Con la lista del ejercicio anterior, 
	 * ahora ordénala al revés, de cadena más larga a más corta.
	 */

}
