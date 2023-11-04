package StringBufferPac;

public class StringBuffer12 {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("Peter");
	sb.append("bhai");
	System.out.println("Append:"+sb);
	
	sb.insert(5, ' ');
	System.out.println("Insert:"+sb);
	
	sb.replace(6, 10, "Parker");
	System.out.println("Replace:"+sb);
	
	sb.delete(6, 12);
	System.out.println("Deleete:"+sb);
	 
	sb.reverse();
	System.out.println("Reverese"+sb);
	
	sb.capacity()	;
	System.out.println(sb);
	
}
}
