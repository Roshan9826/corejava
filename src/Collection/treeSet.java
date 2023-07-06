package Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class treeSet {

	public static void main(String[] args) {
		SortedSet set = new TreeSet();
		set.add("a");
		set.add("b");
		set.add("f");
		set.add("c");
		set.add("e");
		set.add("a");
		set.add("c");
		set.add("f");
		set.add("g");
		
		for (Object object:set) {
			System.out.print(object);
		}	
			System.out.println();
			System.out.println("========");
			
			System.out.println(set.first());
			System.out.println(set.last());
			System.out.println(set.headSet("c"));
			System.out.println(set.tailSet("c"));
			System.out.println(set.subSet("a","b"));
			
		

	}

}
