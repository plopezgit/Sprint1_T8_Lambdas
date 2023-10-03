package xtra.replaceAllTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<String> methodNames = new ArrayList<>(Arrays.asList("sort", "filter", "removeIf", 
				"println", "map", "asList"));
		
		methodNames.forEach(m -> System.out.println(m));

		methodNames.replaceAll(m -> m.toUpperCase());

		methodNames.forEach(System.out::println);
	}

}
