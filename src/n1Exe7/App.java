package n1Exe7;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<>();
		list.add("Lorem ipsum dolor sit amet");
		list.add("Lorem ipsum dolor sit amet consectetur adipiscing elit");
		list.add("Lorem ipsum");
		list.add("Lorem");
		list.add("L");
		list.add(1111111);
		list.add(11);
		list.add(1111);
		
		Collections.sort(list, (o1, o2) -> o2.toString().compareTo(o1.toString()));
		
	}
	
	/*
	 * Con la lista del ejercicio anterior, 
	 * ahora ordénala al revés, de cadena más larga a más corta.
	 */

}
