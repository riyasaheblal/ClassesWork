package Basic;

public class RemainderAdd {
public static void main(String[] args) {
	int[] a= {6,11,13,26,36};
	       // 0+ 5+ 1+ 2+ 0= 8
	int sum=0;
	for (int i = 0; i < a.length; i++) {
		sum+=a[i]%6;
	}
	System.out.println("sum of remainders is : "+ sum);
}
}
