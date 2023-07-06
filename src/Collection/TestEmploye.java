package Collection;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
//import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TestEmploye {

	public static void main(String[] args) {
	List list = new ArrayList();
    list.add(new Employe (1,"mouseen", 1000));
    list.add(new Employe (1,"juber",20000));
    list.add(new Employe(3,"khusali",5000));
    list.add(new Employe(5,"suman",3000));
    list.add(new Employe(3,"Priyanshi",1500));
    list.add(new Employe(5,"Amisha",4000));
   /* for (Object object: list){

     System.out.println(object);
    }*/
    Collections.sort(list);

     Iterator it = list.iterator();
     while (it.hasNext()) {
		Object object = (Object) it.next();
		System.out.println(object);
	}
  
	

	
	
	}
}


