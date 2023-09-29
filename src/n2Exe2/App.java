package n2Exe2;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(10);
		list.add(13);
		list.add(27);
		list.add(115);
		list.add(28);
		System.out.println(App.comasIf(list));
		
	}
	
	public static String comasIf (List<Integer> list) { //No lambda
		String result = "";
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).intValue() == (list.get(i).intValue()*1/2*(2))) {
				result +="e"+list.get(i).toString()+",";
			} else {
				result +="o"+list.get(i).toString()+",";
			}
		}

		return result;
	}
	
	public static String lambdaComasIf (List<Integer> list) { // lambda
		String result = "List: ";
		

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
