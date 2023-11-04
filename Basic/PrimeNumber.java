package Basic;

public class PrimeNumber {

	public static void main(String[] args) {
		int count1=0;
		for(int n=1; n<=1000; n++) {
		//int n=7;
		int count=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				//System.out.println(i);
				count++;
			}
			
}
		if(count==2) {
			System.out.println("Prime Number::"+n);
			count1++;}
//		}else {
//			System.out.println("not a prime number::"+n);
//		}
	}
		System.out.println(count1);
}
}