package Test;

public class ConversionOfString {
public static void main(String[] args) {
	String s="Hello Guys lets go For a Ride";
	System.out.println(s);
	String[] s1= s.split(" ");
	for (int i = 0; i < s1.length; i++) {
		int x= i%3;
		switch (x) {
		case 0: s1[i] =Vowel(s1[i]);
			break;
		case 1: s1[i] =Consonant(s1[i]);
		break;
		case 2: s1[i] =s1[i].toUpperCase();
		break;
		}
	}
	System.out.println("Encrypted Value");
	for (int i = 0; i < s1.length; i++) {
		System.out.print(s1[i]+" ");
	}
}

private static String Consonant(String s) {
	char[] ch=s.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]!='a'&& ch[i]!='e'&& ch[i]!='i' && ch[i]!='o'&&  ch[i]!='u' ) {
			ch[i]='%';
		}
	}
	return new String(ch);
}

private static String Vowel(String s) {
	char[] ch=s.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'|| ch[i]=='u' ) {
			ch[i]='#';
		}
	}
	return new String(ch);
}


}
