package Test;

public class DuplicateCount {
public static void main(String[] args) {
	int a[]= {6,1,1,3,4,5,5,6,1};
	boolean[] b=new boolean[a.length];
	for (int i = 0; i < b.length; i++) {
		int count;
		if(b[i]==false) {
			count=1;
			for (int j = i+1; j < b.length; j++) {
				if(a[i]==a[j]) {
					count++;
					b[j]=true;
				}
				
			}
			System.out.println(a[i]+ " duplicate is ::"+ count);
		}
	}
}
}
