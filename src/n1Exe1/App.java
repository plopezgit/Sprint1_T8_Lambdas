package n1Exe1;

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
		
		FilterListBy<String> filter = (list, ch) -> {	
			List<String> result = words.stream().filter(word -> word.matches(ch)).collect(Collectors.toList());
			return result;
		};
		
		System.out.println(filter.filterBy(words, "[a-zA-Z]*o[a-zA-Z]*"));
		
	}
	
	/*
	 * A partir de una lista de Strings, escribe un método que devuelve una lista de 
	 * todas las cadenas que contienen la letra ‘o’. Imprime el resultado.
	 */

}
