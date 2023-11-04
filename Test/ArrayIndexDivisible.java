package Test;

public class ArrayIndexDivisible {
	
	public static void main(String[] args) {
		int a[]= {6,11,13,26,36};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
	        sum+=a[i]%6;
		}
		System.out.println(sum);
	}

}
