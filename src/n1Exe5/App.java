package n1Exe5;

public class App {

	public static void main(String[] args) {
		
		GetNumber number = () -> 3.1415;
		System.out.println(number.getPiValue());
		
	}
	
	/*
	 * Crea una Functional Interface con un método llamado getPiValue() 
	 * que debe devolver un double. Desde el main() de la clase principal, 
	 * instancia la interfaz y asíñale el valor 3.1415. Invoca el método 
	 * getPiValue() e imprime el resultado.
	 */
}
