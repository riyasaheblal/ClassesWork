package Test;

public class stringreverse2 {
	public static void main(String[] args) {


		String s="Welcome to Narnia";
		String s1[]=s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			s1[i]=reverse(s1[i]);
		}
		System.out.println("Reverse String");
    for (int i = 0; i < s1.length; i++) {
		System.out.print(s1[i]+" ");
	}
	}

	private static String reverse(String s) {
		String rev="";
		for (int i = s.length()-1; i >=0; i--) {
		rev=rev+s.charAt(i);
		}
		return rev;
	}}
