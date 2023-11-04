package Basic;

public class Insertioninsteadofbinary {
public static void main(String[] args) {
	int a[]= {6,4,3,5,2,1}; //4 6 3 5 2 1  // 
	for (int i = 1; i < a.length; i++) {
		int temp=a[i];
		int j=i;
		while (j>0 && a[j-1]>temp) {
			a[j]=a[j-1];
			j--;
		}
		a[j]=temp;
	   }
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]);
	}
}
}
