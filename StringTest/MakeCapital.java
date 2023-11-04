package StringTest;

public class MakeCapital {
public static void main(String[] args) {
	String s="java";
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i)=='a') {
			System.out.print(s.toUpperCase().charAt(i));
		}
		else {
			System.out.print(s.charAt(i));
		}
	}
}
}
