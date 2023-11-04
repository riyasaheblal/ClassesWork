package Basic;

public class Array_second_largest {
	public static void main(String[] args) {
		int[] a= {19,125,79,12,80,11};
		int largest=a[0];
		int slargest=0;
		for(int i=0; i<a.length; i++) {
         if(a[i]>largest) {
        	 slargest=largest;
        	 largest=a[i];
         }
         else if (a[i]!=largest && a[i]>slargest) {
			slargest=a[i];
		}
		
		}
		System.out.println(largest);
        System.out.println(slargest);
	}}

