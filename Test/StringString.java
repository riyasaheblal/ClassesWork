package Test;

import java.util.Iterator;

public class StringString {
public static void main(String[] args) {
	String s="statisticse";
	char[] ch=s.toCharArray();
	boolean[] b=new boolean[ch.length];
	for (int i = 0; i < ch.length; i++) {
		int count;
		if(b[i]==false) {
			count=1;
		
		for (int j = i+1; j < ch.length; j++) {
			if(ch[i]==ch[j]) {
				count++;
				b[j]=true;
			}
		}
		//System.out.println(ch[i]+" "+ count);
		if(count==1 ) {
			System.out.println(ch[i]);
			break;
		}
	}}
}
}
