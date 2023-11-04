package Basic.StringProject.String;

import java.util.Iterator;

public class StringCharReverse {
	public static void main(String[] args) {
		String s="Welcome to Narnia";
		String[] s1=s.split(" ");
		System.out.println("Normal String :: "+s);
		for (int i = 0; i < s1.length; i++) {
			s1[i]=NormalReverse(s1[i]);
		}
		//1	//Welcome to Narnia--> emocleW ot ainraN 
        System.out.println("====Normal String with char Reverse===");
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i]+" ");
		}

		System.out.println(" ");
        System.out.println("====String and char Reverse====");
		//2// Welcome to Narnia--> ainraN  ot emocleW

		for (int i = s1.length-1; i >= 0; i--) {
			System.out.print(s1[i]+" ");
		}
	}

	private static String NormalReverse(String s) {
		char[] ch=s.toCharArray();
		String res="";
		for (int i = s.length()-1; i >=0; i--) {
			res+=ch[i];
		}
		return res;
	}

//	private static String NormalReverse(String s) {
//		String result="";
//		for (int i = s.length()-1; i >=0; i--) {
//			result+=s.charAt(i);
//		}
//		return result;
//	}


}
