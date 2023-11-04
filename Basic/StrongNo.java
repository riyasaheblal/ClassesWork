package Basic;

public class StrongNo {
	
	//145 -> 1! 4! 5!-> 1+24+120=145
	
	public static void main(String[] args) {
		int count=0;
		for(int j=1;j<=1000;j++) {
			//int n=145;
		int n=j;
		int temp=n;
		int sum=0;
		while(n>0) {
			int d=n%10;
			int fact=1;
			 for(int i=1; i<=d; i++) {
					fact=fact*i;
		  }	
			 
		n=n/10;		
		sum=sum+fact;

		}if(sum==temp) {
			System.out.println("It is strong number::"+temp);
			count++;
		}
	}
System.out.println(count);
}}
