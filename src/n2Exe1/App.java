package n2Exe1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>(Arrays.asList("Manel", "Lex", "Ada", "Luisa", "Romina", "Juan"));

		FilterableList<String, Integer> filter = (lis, ch, len) -> {
			List<String> result = names.stream().filter(word -> (word.length() == len) && (word.startsWith(ch)))
					.collect(Collectors.toList());
			return result;
		};

		filter.filterBy(names, "A", 3).forEach(System.out::println);
	}

	/*
	 * Crea una lista de cadenas con nombres propios. Escribe un método que devuelve
	 * una lista de todas las cadenas que comienzan con la letra 'A' (mayúscula) y
	 * tienen exactamente 3 letras. Imprime el resultado.
	 */

}
