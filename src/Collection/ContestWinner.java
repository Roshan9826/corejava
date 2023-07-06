package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ContestWinner {

	public static void main(String[] args) {
		ArrayList <Contestant> list = new ArrayList<Contestant>() ;
	list.add (new Contestant("Ram","99812345678"));
	list.add(new Contestant("Shyam","9912342222"));
	list.add(new Contestant("Ajay","9912345770"));
	list.add(new Contestant("Vijay","9912345678"));
	list.add(new Contestant("jay","99123458888"));
	list.add(new Contestant("Invalid NO","11")); 
	System.out.println("Winners!!");
	
	list.stream().map(e-> e.phone).filter(e-> e.length()==10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(),e->{
		Collections.shuffle(e);
		return e.stream();
	
		
	})).limit(3).forEach(e-> System.out.println(e));
	
	}
}

class Contestant {

	public String phone= null;
	public  String name = null;

	public Contestant(String n, String p) {
		
		name = n;
		phone = p;
		
	}

}
	
