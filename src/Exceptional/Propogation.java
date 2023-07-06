package Exceptional;

public class Propogation {
	public static void main(String[] args) {
		dad();
	}
	public static void dad() {
		try {
			mom();
		} catch (Abnihogi e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}
	}
	public static void mom() throws Abnihogi {
		son();
	}
	public static void son() throws Abnihogi {
		throw new Abnihogi();
	}

}
