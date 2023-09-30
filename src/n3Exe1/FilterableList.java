package n3Exe1;

import java.util.List;

@FunctionalInterface
public interface FilterableList<T, U, N extends Number> {
	public List<T> filterBy (List<T> t, U u, N n);
}
