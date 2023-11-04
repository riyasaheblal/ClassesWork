package Basic;

public class MagicNumber {
public static void main(String[] args) {
	int n=175;
	int sum=0;
	while(n>0 || sum>9) {
		if(n==0) {
			n=sum;
			sum=0;
		}
		int d=n%10;
		sum=sum+d;
		n=n/10;
	}
	System.out.println(sum);
}
}
