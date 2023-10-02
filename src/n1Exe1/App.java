package n1Exe1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		List <String> words = 
				new ArrayList<>(Arrays.asList("oasis", "aorta", "pio", "al", "firma", "metodo"));

		
		FilterableList<String> filter = (list, ch) -> {	
			List<String> result = words.stream().filter(word -> word.contains(ch)).collect(Collectors.toList());
			return result;
		};
		
		filter.filterBy(words, "o").forEach(System.out::println);
		
	}
	
	/*
	 * A partir de una lista de Strings, escribe un método que devuelve una lista de 
	 * todas las cadenas que contienen la letra ‘o’. Imprime el resultado.
	 */

}
