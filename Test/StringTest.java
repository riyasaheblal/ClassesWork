package Test;

public class StringTest {
	public static void main(String[] args) {
		String s="I am Peter Parker";
		String s1[]=s.split(" ");
		String rev="";
		for (int i = 0; i < s1.length; i++) {
        
  			rev=rev+s1[i];
  
          
//			if(s.charAt(i)!='a' &&s.charAt(i)!='e' && s.charAt(i)!='i' &&s.charAt(i)!='o' &&s.charAt(i)!='u'  ) {
//				System.out.print(s.charAt(i) );
//			}
			}
		System.out.println(rev);

	}


}
