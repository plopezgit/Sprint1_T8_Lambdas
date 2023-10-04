package xtra.dataOperationTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		List<String> methodNames = new ArrayList<>(Arrays.asList("3434", "545", "56", "54645", "5", 
				"println", "map", "asList"));
		
		// +filter(Predicate<T>):Stream<T> Retorna un Stream que contiene sólo los elementos que cumplen con el predicado pasado por parámetro.
		
		methodNames.stream().filter(m -> m.charAt(0)=='s').collect(Collectors.toList()).forEach(System.out::println);
		System.out.println(methodNames.stream().filter(m -> m.charAt(0)=='s').count());
		
		// +distinct():Stream<T> Retorna un Stream sin elementos duplicados. Depende de la implementación de +equals(Object):boolean.

		methodNames.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
		System.out.println(methodNames.stream().distinct().count());

		// +limit(long):Stream<T> Retorna un Stream cuyo tamaño no es mayor al número pasado por parámetro. Los elementos son cortados hasta ese tamaño.
		
		methodNames.stream().limit(3).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println(methodNames.stream().limit(3).count());
		
		// +skip(long):Stream<T> Retorna un Stream que descarta los primeros N elementos, donde N es el número pasado por parámetro. Si el Stream contiene menos elementos que N, entonces retorna un Stream vacío.
		
		methodNames.stream().skip(1).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println(methodNames.stream().skip(9).count());

		//+map(Function<T, R>): Stream<R> Retorna un Stream que contiene el resultado de aplicar la función pasada por parámetro a todos los elementos del Stream. Transforma los elementos del tipo T al tipo R.
		
		methodNames.stream().map(m -> m.replace('s', '5')).forEach(System.out::println);;
		
		
		/*Primitives:
		 * +mapToDouble(ToDoubleFunction<T>): DoubleStream Transforma un Stream<T> a un DoubleStream por medio de la función pasada por parámetro.
		 * +mapToInt(ToIntFunction<T>): IntStream Transforma un Stream<T> a un IntStream por medio de la función pasada por parámetro.
		 * +mapToLong(ToLongFunction<T>): LongStream Transforma un Stream<T> a un LongStream por medio de la función pasada por parámetro.
		 */
		
	}

}
