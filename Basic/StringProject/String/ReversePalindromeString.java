package Basic.StringProject.String;

public class ReversePalindromeString {
public static void main(String[] args) {
	String s="hello";    //olleh
	String rev="";
	for (int i = s.length()-1; i>=0; i--) {
		rev+=s.charAt(i);
//		System.out.print(s.charAt(i));
	}
	//System.out.println(rev);
	if(s.equals(rev)) {
		System.out.println("It palindrome: "+ s);
	}
	else {
		System.out.println("Its not a palindrome: "+s);
	}
}
}
