package Basic.StringProject.String;

public class IgnoreCase {
	public static void main(String[] args) {
		//convert lowercase +32 and reverse
		String s="Hello";
		char[] ch=s.toCharArray();
		for (int i = s.length()-1; i>=0; i--) {
			if(ch[i]>='A' && ch[i]<='Z') {
				ch[i]+=32;	
				System.out.print(ch[i]);
			}
			else {
				System.out.print(ch[i]);
			}
		}
//		s=new String(ch);     //store the object
//       	// new String();
//		// new String(" ")	
//		// new String (ch[])
//			System.out.println(s);

	}
}
