package n2Exe3;

public class App {

	public static void main(String[] args) {
		
		Calculable calc = (n1, op, n2) -> {
			return switch (op) {
			case '+' -> n1 + n2;
			case '-' -> n1 - n2;
			case '*' -> n1 * n2;
			case '/' -> {
	            if (n2 == 0) {
	                throw new IllegalArgumentException("Can't divide by 0.");
	            }
	            yield n1 / n2;
			}
		    default -> throw new IllegalArgumentException("Unknown operator.");
			};

		};
		
		try {
			System.out.println(calc.operate(1, '9',  0));
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} 

	}
	
	/*
	 * Crea una Functional Interface que contenga un método llamado operacion(). 
	 * Este método debe devolver un float. 
	 * Inyecta a la interfaz creada mediante una lambda, el cuerpo del método, 
	 * de modo que se pueda transformar la operación 
	 * con una suma, una resta, una multiplicación y una división.
	 */

}
