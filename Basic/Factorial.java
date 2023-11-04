package Basic;

public class Factorial {

	public static void main(String[] args) {
		int product=1;
		int n=5;       //prp format of factorial by giving an n value 
		for(int i=1; i<=n;i++) {
			product*=i;
		}
		System.out.println(product);
	}
}
