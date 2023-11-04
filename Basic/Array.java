package Basic;

public class Array {
public static void main(String[] args) {
	int[] a= {10,20,30,40,50};//adress  s.o.print print its a method in which it contains print(int)...
	char[] ch= {'c','a','t'};//data   print(char[]) print(char)
	System.out.println(ch);//data
	System.out.println("ch : "+ch);//adress  2 string
	System.out.println(a);// print address
    for(int i=0; i<a.length; i++) {
    	//index;    size;   updatation
    	System.out.println(a[i]);
    }
}
}
