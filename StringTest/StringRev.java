package StringTest;

public class StringRev {
	public static void main(String[] args) {
		String s="MADAM";
		String rev="";
		for (int i = s.length()-1; i >=0; i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
		System.out.println(rev+" :Is a plindrome");
		}else {
			System.out.println(rev+" :Not a plindrome");

		}

	}

}
