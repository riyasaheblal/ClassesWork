package Basic;

public class Array_odd_element {
	
	public static void main(String[] args) {
		int[] a= {1,15,36,40,52};
		int sum=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==1)
			sum=sum+a[i];
		}
		System.out.println(sum);

	}}


