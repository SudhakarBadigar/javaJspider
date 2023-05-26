package collectionFramework;

import java.util.Comparator;

public class ComparatorLaptopSort implements Comparator<LaptopSort>{

	@Override
	public int compare(LaptopSort o1, LaptopSort o2) {
		return o1.cost.compareTo(o2.cost);
	}

}
