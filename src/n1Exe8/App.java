package n1Exe8;

public class App {

	public static void main(String[] args) {

		Reversable reverse = (frase) -> {
			for (int i = frase.length() - 1; i != -1; i--) {
				System.out.print(frase.charAt(i));
			}
			return frase;
		};

		reverse.reverse("etneup");
		
		//
		
		Reversable reverse2 = (frase) -> {
			StringBuilder reversed = new StringBuilder(frase).reverse();
            return reversed.toString();
		};
		
		System.out.println(reverse2.reverse(" razurc "));
	}

	/*
	 * Crea una Functional Interface que contenga un método llamado reverse(). Este
	 * método debe recibir y debe devolver un String. En el main() de la clase
	 * principal, inyecta a la interfaz creada mediante una lambda, el cuerpo del
	 * método, de modo que devuelva la misma cadena que recibe como parámetro pero
	 * al revés. Invoca la instancia de la interfaz pasándole una cadena y comprueba
	 * si el resultado es correcto.
	 */

}
