package Test;

public class sumOfPair {
public static void main(String[] args) {
	int a[]= {1,2,6,3,9,11,7};
	int sum=9;
	int count=0;
	for (int i = 0; i < a.length-2; i++) {
		for (int j = i+1; j < a.length-1; j++) {
			if(count==1) {
				break;
			}
			for (int k = j+1; k < a.length; k++) {
				
			int c=a[i]+a[j]+a[k];
			if(c==9 ) {
				count++;

				System.out.println("{"+a[i]+","+a[j]+","+a[k]+"}");
			}
		}}
	}
	
	System.out.println(count);
}
}
