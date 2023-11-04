package Basic;

public class PerfectNo {
public static void main(String[] args) {
	int count=0;

	for(int n=1; n<1000; n++) {
	//int n=6;
	int sum=0;
	for(int i=1; i<n;i++) {
		if(n%i==0) {
			sum=sum+i;
		}
	}
	if(sum==n) {
		System.out.println("Its perfect Number::" + n);
		count++;
	}

}
	System.out.println("count of number is::"+count);

}}
