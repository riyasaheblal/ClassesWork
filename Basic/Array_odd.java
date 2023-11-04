package Basic;

public class Array_odd {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		int sum=0;
		for(int i=0; i<a.length; i++) {
			if(i%2==1)
			sum=sum+a[i];
		}
		System.out.println(sum);

	}}
