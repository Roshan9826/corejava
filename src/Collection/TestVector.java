package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
	Vector v = new Vector();
	v.add("four");
	v.add("two");
	v.add(3);
	v.add("four");
	v.add(5);
	Enumeration e = v.elements();
   while (e.hasMoreElements()) {
	   System.out.println(e.nextElement());
	   
   }
	}

}
