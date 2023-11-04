package StringTest;

public class CompareToWithoutThirdVariable {
public static void main(String[] args) {
	String a="hello";
	String b="boy";
	a=a.concat(b);
	b=a.substring(0,a.length()-b.length());
	a=a.substring(b.length());
	System.out.println("a::"+ a +" b:: "+ b);
}}