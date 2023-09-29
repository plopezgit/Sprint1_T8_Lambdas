package n1Exe6;

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
		
		Collections.sort(list, (o1, o2) -> o1.toString().compareTo(o2.toString()));
		
	}
	
	/*
	 * Crea una lista con números y cadenas de texto y ordena 
	 * la lista con las cadenas de más corta a más larga.
	 */

}
