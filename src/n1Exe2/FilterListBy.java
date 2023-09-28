package n1Exe2;

import java.util.List;

@FunctionalInterface
public interface FilterListBy<T> {
	public List<T> filterBy (List<T> t, T t1);
}
