package n2Exe4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class App {

	public static void main(String[] args) {
		
		List<String> thingsList = new ArrayList<>();
		
		thingsList.add("56");
		thingsList.add("in Xanadu did Kubla Khan");
		thingsList.add("a stately pleasure-dome decree");
		thingsList.add("wher3 Alph, th# sacr3d riv3r, ran");
		thingsList.add("through cav3rns m3asur3l3ss to man");
		thingsList.add("down to a sunless sea");
		thingsList.add("eu");
		thingsList.add("1");

		OrderMapAndFilterTest consecutiveProcess = (list, i, l, c1, c2) -> {
			List<String> processedList = new ArrayList<>(); 
			processedList = list.stream()
					.sorted((s1, s2) -> s1.charAt(i) - s2.charAt(i))
					.sorted((s1, s2) -> {
						boolean s1e = s1.contains(l);
						boolean s2e = s2.contains(l);
						if (s1e && !s2e) {
							return -1;
						} else if (!s1e && s2e) {
							return 1; 
						} else {
							return 0; 
						}
					})
					.map(s -> s.replace(c1, c2))
					//.filter(s -> s.chars().allMatch(Character::isDigit)) // Descomment to get only elemnts of numbers
					.collect(Collectors.toList());
			
			return processedList; 
		};
		
		consecutiveProcess.processingBy(thingsList, 0, "e", 'a', '4').forEach(System.out::println);
		
	}

	/*
	 * Crea una lista que contenga algunas cadenas de texto y números.
	 * Ordénalas por:
	 * Alfabéticamente por su primer carácter. 
	 * (Nota: charAt(0) devuelve el código numérico del primer carácter)
	 * Las cadenas que contienen una "e" primero, el resto de cadenas después. 
	 * Pone el código directamente en la lambda.
	 * Modifica todos los elementos de la lista que tienen una a. 
	 * Modifica la 'a' por un '4'.
	 * Muestra sólo los elementos que son numéricos. 
	 * (Aunque estén guardados como Strings).
	 */

}
