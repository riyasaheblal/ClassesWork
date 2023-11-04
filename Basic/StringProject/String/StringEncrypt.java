package Basic.StringProject.String;

public class StringEncrypt {
public static void main(String[] args) {
	String s="Hello Guys lets go For a Ride";
	String[] s1=s.split(" ");
	for (int i = 0; i < s1.length; i++) {
		//System.out.println(s1[i]);
		int x=i%3;
		switch (x) {
		case 0: s1[i]=vowel(s1[i]);
			
			break;

		case 1: s1[i]=consonant(s1[i]);
		
		break;
		case 2: s1[i]=s1[i].toUpperCase();
		//ch-32 =upper case a-->A
		
		break;
		}
	}
	for (int i = 0; i < s1.length; i++) {
		System.out.print(s1[i]+" ");
	}

}

private static String consonant(String s) {
	char[] ch=s.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]!='a' && ch[i]!='e' && ch[i]!='i' && ch[i]!='o' && ch[i]!='u') {
			ch[i]='%';
		}
	}
	return new String(ch);
}
	


private static String vowel(String s) {
	char[] ch=s.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]=='a' || ch[i]=='e'|| ch[i]=='i' || ch[i]=='o'|| ch[i]=='u') {
			ch[i]='#';
		}
	}
	return new String(ch);
}
}
