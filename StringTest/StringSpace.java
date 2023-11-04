package StringTest;

public class StringSpace {
public static void main(String[] args) {
	String s="RiyaGuptaVaishanviRathod";
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i)==s.toUpperCase().charAt(i)) {
			System.out.print(" "+ s.charAt(i));
		}
		else {
			System.out.print(s.charAt(i));
		}
	}
}
}
