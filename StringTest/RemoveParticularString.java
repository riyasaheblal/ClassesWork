package StringTest;

public class RemoveParticularString {
public static void main(String[] args) {
	String s="Titanitii";
	for (int i = 0; i < s.length(); i++) {
		if(s.toLowerCase().charAt(i)!= 'i' ) {
			System.out.print(s.charAt(i));
		}
		
	}
}
}
