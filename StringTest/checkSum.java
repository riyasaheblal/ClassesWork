package StringTest;

public class checkSum {
public static void main(String[] args) {
	int a[]= {2,2,2,2,2,1};//it contains sum kitne time
	int sum=0;
	int count=0;
	int avg=0;
	int count1=0;

	for (int i = 0; i < a.length; i++) {
		sum+=a[i];
		count++;
	}
//	System.out.println(sum+" "+ count);
	for (int i = 0; i < a.length; i++) {
		avg=sum/count;
		if(avg==a[i]) {
			count1++;
		}
	}
	System.out.println( "It contains "+ avg + " This much time "+ count1);

	System.out.println(avg);
}
}
