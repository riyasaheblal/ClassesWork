package test;

public class palindrome {
	
	public static void main(String[] args) {
		int count = 0;

	for(int i=1;i<=1000;i++) {
		int n=i;
		int reverse=0;
			int temp=n;
		while(n>0) {
			int d=n%10;
			reverse=reverse*10+d;
			n=n/10;
			
			
		}
		if(reverse==temp) {
			System.out.println("This is palindrome:::"+temp);
			count++;
		}
		
		//System.out.println(reverse);

	}
	System.out.println("Palindrome count is::"+count);}

}
