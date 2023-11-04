package Test;

public class PalindromeString {
	public static void main(String[] args) {
		String s="Level";
		   String rev="";
		   
			System.out.println("String Reverse");
			for (int i = s.length()-1; i >= 0 ; i--) {
				rev+=s.charAt(i);
			}
			System.out.println(rev);
			if(s.toLowerCase().equals(rev.toLowerCase())) {
				//equalsIgnoreCase case sensitive
				System.out.println("Its Palindrome");
			}
			else {
				System.out.println("Its not a palindrome");
			}
	}
	
}
