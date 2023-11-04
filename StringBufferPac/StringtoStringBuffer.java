package StringBufferPac;

public class StringtoStringBuffer {
public static void main(String[] args) {
	//string to stringBuffer
	String s="Riya";
	StringBuffer sb= new StringBuffer(s);
	sb.reverse();
	//StringBuffer string
	s=new String(sb);
	System.out.println(s);
}
}
