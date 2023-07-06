package Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;



public class TestFailFast {

	public static void main(String[] args) {
		//List list = new ArrayList();
		Vector<Comparable> list = new Vector();
		list.add("one");
		list.add("Roshan");
		list.add("raj");
		list.add("aman");
		list.add(100);
		//list.stream().sorted().forEach(e->{System.out.println(e);});
		list.forEach(e->{System.out.println(e);});
		//Enumeration it = list.elements();
		//list.add("200")	;
		//while (it.hasMoreElements()) {
		//System.out.println(it.nextElement());
		}

	}
