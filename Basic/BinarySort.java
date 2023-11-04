package Basic;

import java.util.Iterator;

public class BinarySort {
public static void main(String[] args) {
	int a[]= {6,4,5,3,1,2};
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]>a[j]) {
			int temp=a[j];
			a[j]=a[i];
			a[i]=temp;
		}}
	}
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]);
	}
}
}
