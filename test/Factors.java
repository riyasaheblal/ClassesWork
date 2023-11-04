package test;

public class Factors {
	//number which is totally divided by any number
	public static void main(String[] args) {
		int n=1000;
		int sum=0;
		int count=0;
		for(int i=1; i<=n; i++) {
		if(n%i==0) {
		//	System.out.println(i);
		//	count++;
			sum+=i;
			if(sum==n){
				System.out.println(n +" "+ "is perfect number");	
				}
			}

	}
		
		//System.out.println("The counts of factor is::"+ count);

	}
}
;