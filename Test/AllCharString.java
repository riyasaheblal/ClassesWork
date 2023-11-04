package Test;

public class AllCharString {
public static void main(String[] args) {
	String s="Hello";
   String rev="";
   
	System.out.println("String Reverse");
	for (int i = s.length()-1; i >= 0 ; i--) {
		rev+=s.charAt(i);
	}
	System.out.println(rev);

//	System.out.println("------------------------------");
//	System.out.println("String forward ");
//	for (int i = 0; i < s.length(); i++) {
//		System.out.println(s.charAt(i));
//	}
}
}
