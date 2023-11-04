package Basic.StringProject.String;

import java.util.Iterator;

public class RemoveSpaceVowel {
	public static void main(String[] args) {
//I am Peter parker-->IamPeterparker
	String s="I am Peter parker";
	String[] s1=s.split(" ");
	
	for (int i = 0; i < s1.length; i++) {
		s1[i]=StickAndCheckVowel(s1[i]);
	}
	for (int i = 0; i < s1.length; i++) {
		System.out.print(s1[i]);
	}
	}

	private static String StickAndCheckVowel(String s) {
		String result="";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!='a'&& s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u') {
				result+=s.charAt(i);

			}
		}
		return result;
	}
}
