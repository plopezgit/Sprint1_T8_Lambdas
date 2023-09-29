package n1Exe2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		List <String> words = new ArrayList<>();
		words.add("oasis");
		words.add("aorta");
		words.add("pio");
		words.add("alma");
		words.add("firma");
		words.add("metodo");
		
		FilterableList<String, Integer> filter = (list, ch, len) -> {	
			List<String> result = words.stream().filter(word -> (word.length() > len) && (word.matches(ch))).collect(Collectors.toList());
			return result;
		};
		
		System.out.println(filter.filterBy(words, "[a-zA-Z]*o[a-zA-Z]*", 5));
		
	}
	
	/*
	 * Tienes que hacer lo mismo que en el punto anterior, 
	 * pero ahora, el método debe devolver una lista con 
	 * los Strings que además de contener la letra “o” 
	 * también tienen más de 5 letras. Imprime el resultado.
	 */

}
