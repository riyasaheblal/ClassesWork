package Test;

public class Stringggg {
public static void main(String[] args) {
	String s="Hello";  //SCP-->Sp@12
	String x=new String("Hello");
	String y=s.intern();  //Sp@12
	System.out.println("y:"+ y);
	System.out.println(s==x);    //check address  == // equals value
	System.out.println(s==y);    //check same obj
}
}
