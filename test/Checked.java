package test;


public class Checked {
	
	
	public static void main(String[] args)  {
		try {
			demo();
		} catch (Exception e) {
System.out.println("Hello exception");	
}
	}

	
	
	
	private static void demo() throws Exception, ClassNotFoundException,ArithmeticException {
		Class.forName(null);
	}

}
