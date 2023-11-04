package Basic;

public class PalindromeofNumber {
	
	public static void main(String[] args) {
		int count=0;

		for(int i=1; i<=1000; i++) {
		//int n=121;
			int n=i;
		int temp=n;
		int rev=0;
		while(n>0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
       if(temp==rev) {
    	   System.out.println("This is palindrome::"+ temp);
    	   count++;
       }
	}
	       System.out.println(count);

}}
