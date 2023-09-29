package n1Exe2;

import java.util.List;

@FunctionalInterface
public interface FilterableList<T, N extends Number> {
	public List<T> filterBy (List<T> t, T t1, N n);
}
