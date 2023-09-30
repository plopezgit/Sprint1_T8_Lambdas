package n2Exe3;

public class App {

	public static void main(String[] args) {
		
		Calculable calc = (n1, op, n2) -> {
			float result = 0;
			switch (op) {
				case '+' :
					result = n1 + n2;
				break;
				case '-' :
					result = n1 - n2;
				break;
				case '*' :
					result = n1 * n2;
				break;
				case '/' :
					result = n1 / n2;
				break;
			}
			return result;

		};
		
		System.out.println(calc.operate(1, '+',  2));

	}
	
	/*
	 * Crea una Functional Interface que contenga un método llamado operacion(). 
	 * Este método debe devolver un float. 
	 * Inyecta a la interfaz creada mediante una lambda, el cuerpo del método, 
	 * de modo que se pueda transformar la operación 
	 * con una suma, una resta, una multiplicación y una división.
	 */

}
