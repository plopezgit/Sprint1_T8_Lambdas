package xtra.removeIfTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<String> methodNames = new ArrayList<>(Arrays.asList("sort", "filter", "removeIf", 
				"println", "map", "asList"));
		
		methodNames.forEach(m -> System.out.println(m));

		//https://github.com/plopezgit/Sprint1_T8_Lambdas/issues/2#issuecomment-1742736153
		methodNames.removeIf(m -> m.equalsIgnoreCase("removeIf"));
		methodNames.forEach(System.out::println);
	}

}
