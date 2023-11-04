package test;

public class SpecialNumber {
	
	public static void main(String[] args) {
		int n=19;
		int sum=0;
		int temp=n;
		int prod=1;
		while(n>0) {
			int d=n%10;
   sum=sum+d;
   prod=prod*d;
			n=n/10;	
			
		}
		System.out.println(sum);
		System.out.println(prod);
		int total=sum+prod;
		if(temp==total) {
			System.out.println("special");
		}
	}

}
