package Collection;

import java.beans.Introspector;
import java.util.ArrayList;
import java.util.List;

public class TestCollection1 {

	public static void main(String[] args) {
	List list = new ArrayList();
 
	list.add( "one");
	list.add("100");
	list.add("two");
	list.set(0, "Raj");	
	System.out.println(list);
		
	}

}
