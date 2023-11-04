package Test;

public class NumberString {
public static void main(String[] args) {
	String s="M3UM2B4A7I";
	char[] ch=s.toCharArray();
	int count=0;
	int sum=0;
	for (int i = 0; i < s.length(); i++) {
		if(ch[i]>='A' && ch[i]<='Z') {
			count++;
			System.out.print(ch[i]);
		}
		else  {
			int s2=s.charAt(i)-48;
			sum+=s2;
		}
	}
	System.out.print(count);
	System.out.print(sum);
}
}
