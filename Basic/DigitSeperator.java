package Basic;

public class DigitSeperator {

	public static void main(String[] args) {
		int n=153;
		
		while(n>0) {
			int d=n%10;
			n=n/10;
			System.out.println(d);
		}
	}
}
