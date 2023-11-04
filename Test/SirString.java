package Test;

public class SirString {
public static void main(String[] args) {
	String s="I am Peter Parker";
	String rev=""; 
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i)!=' ') {
			if(s.charAt(i)!='a' &&s.charAt(i)!='e' && s.charAt(i)!='i' &&s.charAt(i)!='o' &&s.charAt(i)!='u'  ) {
				rev=rev+s.charAt(i);

			}
		}
		
	}
	System.out.println(rev);
}
}
