package n2Exe4;

import java.util.List;

@FunctionalInterface
public interface OrderMapAndFilterTest {
	public List<String> processingBy (List<String> list, int index, 
										String letter, char c1, char c2);
}
