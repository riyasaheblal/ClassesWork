package Test;

public class twoarrayadd {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int b[]= {6,7,8,9,10};
	int c[]=new int[a.length+b.length];
	//System.out.println(c.length);
	
	for (int i = 0; i < a.length; i++) {
		c[i]=a[i];
	}
	for (int i=b.length, j = 0;i<c.length && j < b.length; j++,i++) {
		c[i]=b[j];
	}
	for (int i = 0; i < c.length; i++) {
		System.out.println(c[i]);
	}
}

}
