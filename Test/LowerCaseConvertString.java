package Test;

public class LowerCaseConvertString {
public static void main(String[] args) {
	String s="LeVEl";
	System.out.println(s);
	//convert any case to lower case
	char ch[]=s.toCharArray();
	for (int i = 0; i < s.length(); i++) {
		if(ch[i]>='A' && ch[i]<='Z') {
            	ch[i]+=32;	
		//}
//		}else {
//        	ch[i]-=32;	
//
//		}
	
	}
	s=new String(ch);
	// new String();
	// new String(" ")	
	// new String (ch[])
		System.out.println(s);
}
}}
