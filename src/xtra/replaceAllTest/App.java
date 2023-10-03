package xtra.replaceAllTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<String> methodNames = new ArrayList<>(Arrays.asList("sort", "filter", "removeIf", 
				"println", "map", "asList"));
		
		methodNames.forEach(m -> System.out.println(m));

<<<<<<< HEAD
		//https://github.com/plopezgit/Sprint1_T8_Lambdas/issues/2#issuecomment-1742736153
=======
>>>>>>> d852cef (uses Comparator.comparing(...).thenComparing(...) method class)
		methodNames.replaceAll(m -> m.toUpperCase());
		//methodNames.replaceAll(String::toUpperCase);
		methodNames.forEach(System.out::println);
	}

}
