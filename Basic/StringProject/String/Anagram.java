package Basic.StringProject.String;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		//act cat lowercase length same char
		String s1="act";
		String s2="cat";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length()!=s2.length()) {
			System.out.println("Its Not an Anagram");
		}
		else {
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean result=Arrays.equals(ch1, ch2);
			if(result==true) {
				System.out.println("Its an anagram");
			}else {
				System.out.println("length is same but Its Not an Anagram ");
			}
		}
	}
}
