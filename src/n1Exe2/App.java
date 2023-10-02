package n1Exe2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		List <String> words = 
				new ArrayList<>(Arrays.asList("oasis", "aorta", "pio", "al", "firma", "metodo"));
	
		FilterableList<String, Integer> filter = (list, ch, len) -> {	
			List<String> result = words.stream().filter(word -> (word.length() > len) && (word.contains(ch))).collect(Collectors.toList());
			return result;
		};
		
		System.out.println(filter.filterBy(words, "o", 5));
		
	}
	
	/*
	 * Tienes que hacer lo mismo que en el punto anterior, 
	 * pero ahora, el método debe devolver una lista con 
	 * los Strings que además de contener la letra “o” 
	 * también tienen más de 5 letras. Imprime el resultado.
	 */

}
