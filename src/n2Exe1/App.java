package n2Exe1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import n1Exe2.FilterableList;

public class App {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Manel");
		names.add("Ada");
		names.add("Ari");
		names.add("Luis");
		names.add("Romina");

		FilterableList<String, Integer> filter = (lis, ch, len) -> {
			List<String> result = names.stream().filter(word -> (word.length() == len) && (word.startsWith(ch)))
					.collect(Collectors.toList());
			return result;
		};

		System.out.println(filter.filterBy(names, "A", 3));
	}

	/*
	 * Crea una lista de cadenas con nombres propios. Escribe un método que devuelve
	 * una lista de todas las cadenas que comienzan con la letra 'A' (mayúscula) y
	 * tienen exactamente 3 letras. Imprime el resultado.
	 */

}
