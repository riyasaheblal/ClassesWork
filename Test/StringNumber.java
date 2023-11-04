package Test;

public class StringNumber {
public static void main(String[] args) {
	int[] a= {2,2,2,2,2};
	int sum=0;
	int avg=0;
	//boolean[] b=new boolean[a.length];
	int count = 0;

	for (int i = 0; i < a.length; i++) {

		sum=sum+a[i];
		}
		
		avg=sum/a.length;
for (int i = 0; i < a.length; i++) {
	if(a[i]==avg) {
		count++;
}

	}
	System.out.println(""+ avg + " it take "+ count +" times");

	
	
}
}
