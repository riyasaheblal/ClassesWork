package Basic;

public class Array_largest_element {
	public static void main(String[] args) {
		int[] a= {7,8,55,14,75};
		int largest=0;
		for(int i=0; i<a.length; i++) {
           if(a[i]>largest) {
        	   largest=a[i];
           }
		}
		System.out.println(largest);

	}}

