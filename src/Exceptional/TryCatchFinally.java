package Exceptional;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 2;
			int c = a/b;
			System.out.println(c);
			String s= "100";
			System.out.println(s.charAt(4));
		
		}catch(IndexOutOfBoundsException e) {
			//e.PrintStackTrace();
			//xSystem.out.println(e.getMessage());
	System.out.println(e);
		}catch(ArithmeticException e) {
			//e.PrintStrackTrace();
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e.getMessage()); 
			
		}
		finally {
			System.out.println("finally");
		}
		
	
		

	}

}
