package Test;

public class StringReverse {

	public static void main(String[] args) {
		String s1="Welcome to Narnia";
		String s2[]=s1.split(" ");
		for (int i = s2.length-1; i >= 0; i--) {
			System.out.print(s2[i]+ " ");
			
		}
		System.out.println("");
		char ch1[]=s1.toCharArray();
		for (int j = ch1.length-1; j >=0; j--) {
			System.out.print(ch1[j]+" ");
		}
	}
}
