package Exceptional;

public class TestInvalidUser {


	public static void main(String[] args) {
		String Name = "admin";
		try {
			if (Name.equals("admin")) {
				System.out.println("valid");
				
			} else {
				throw new InvalidUser();
				
			}

			System.out.println("Hello Java");
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
