package Collection;

import java.util.HashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add(100);
		set.add("one");
		set.add("three");
		set.add(100);
		set.add("two");
		set.add(null);
		set.add("two");
		set.add(null);
		for (Object object:set) {
			System.out.println(object);
		}
		

	}

}
