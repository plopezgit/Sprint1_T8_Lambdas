package n2Exe2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(2,10,13,27,115,28));
		System.out.println(lambdaComasIf(list)); // lambda
		System.out.println(comasIf(list)); // no lambda

	}
	
	public static String lambdaComasIf (List<Integer> list) { // lambda Ref: https://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.25 // https://www.geeksforgeeks.org/java-8-streams-collectors-joining-method-with-examples/
		return list.stream()
                .map(n -> (n % 2 == 0) ? "e" + n : "o" + n).collect(Collectors.joining(", "));
	}
	
	public static String comasIf (List<Integer> list) { 
		String result = "";
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).intValue() == (list.get(i).intValue()*1/2*(2))) {
				result +="e"+list.get(i).toString()+", ";
			} else {
				result +="o"+list.get(i).toString()+", ";
			}
		}

		return result;
	}
	
	
	/*
	 * Programa un método que devuelve una cadena separada por comas, 
	 * basada en una lista de Integers. Cada elemento debe ir precedido 
	 * por letra “e” si el número es par, 
	 * o por la letra “o” si el número es impar. 
	 * Por ejemplo, si la lista de entrada es (3, 55, 44), 
	 * la salida debe ser “o3, o55, e44”. 
	 * Imprime el resultado.
	 */

}
