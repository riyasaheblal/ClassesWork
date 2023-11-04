package Basic;

public class ProductEven {

	public static void main(String[] args) {
		int product=1;
		for(int i=1; i<=5;i++) {
			if(i%2==0)
			product*=i;
		}
		System.out.println(product);
	}
}
