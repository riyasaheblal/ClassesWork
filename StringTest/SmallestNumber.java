package StringTest;

public class SmallestNumber {
public static void main(String[] args) {
	int[] a= {10,34,65,2,54,3};  //{2,3,
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]>a[j]) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}}
		System.out.print(a[i]+ " ");
	}

}
}
