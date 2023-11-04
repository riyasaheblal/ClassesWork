package Test;

public class BubbleSort {
public static void main(String[] args) {
	int a[]= {1,4,5,3,2,6};
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]>a[j]) {
			int temp=a[j];
			a[j]=a[i];
			a[i]=temp;
		}}
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}
