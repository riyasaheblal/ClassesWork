package Basic;

public class SpecialNumber {
	
	//19-> 1+9=10// 1*9=9// sum+prod// 10+9=19
	
	public static void main(String[] args) {
		for(int i=1; i<=1000; i++) {
		int n=i;
		int sum=0;
		int prod=1;
		int temp=n;
		while (n>0) {
			int d=n%10;
			sum=sum+d;
			prod=prod*d;
			n=n/10;
		}
		//System.out.println(sum+" "+prod);
		int total=sum+prod;
		if(total==temp) {
			System.out.println("equal::"+ temp);
		}
	}
	}
}
