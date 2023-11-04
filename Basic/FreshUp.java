package Basic;

public class FreshUp {
	//global not to create obj so we write static
	static	char[] ch;    //null
	static int[] a;   //null
	static int[] b[],c;   //null null
	static int d[],e;  //null ,0
	public static void main(String[] args) {
		//mandatory to intilize in local
		char[] ch1= {'c','a','t'};   //cat
		int[] a1= {};  //[I
		int[] b1[] = {{}},c1= {};    //[[I   //[I
		int d1[] = {},e1 = 0;   //[I  //0
		System.out.println(ch+ " :it declaration of ch");
		System.out.println("if i am inserting anything in char it will give me adress : "+ ch1);
		System.out.println(ch1);
		System.out.println("declaration of single array int : "+ a);
		System.out.println("intilization of single array int : "+ a1);
		System.out.println("double array for b : "+ b + " single array for c : "+ c);
		System.out.println("Declaration "+"double array for b : "+ b1 + " single array for c : "+ c1);
		System.out.println("array for d : "+ d + " normal declaration for e : "+e );
		System.out.println("Declaration  :: array for d1 : "+ d1 + " normal declaration for e1 : "+e1 );
		for (int i = 0; i <1; i++,System.out.println("hello")) {
		}
	}
}
