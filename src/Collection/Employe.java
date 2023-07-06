package Collection;



public class Employe implements Comparable<Employe> {
	private int  id =0;
	private String name = null;
	private int Salary= 0; 
	public Employe (int id , String name, int Salary) {
		this. id = id;
		this.name =name;
		this.Salary=Salary;	
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return Salary;
	}
	@Override
	public String toString() {
		return id +" "+name +" "+ Salary+ "";
	}
	@Override
	public int compareTo(Employe o) {
		if(this.id-o.id==0) {
			return this.name.compareTo(o.name);
		}
		return this.id-o.id;
	}

	}
	
	
	
	
	


