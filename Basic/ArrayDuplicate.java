package Basic;

public class ArrayDuplicate {
public static void main(String[] args) {
	int[] a= {1,2,3,1,5,1,3,18,11,18,4,4,5,6,7,11};
	//  b     f f f f f f f f f f f f f
	//  b     f f f t t t f f f f f f f
	//this duplicate we can use for everything int and char
	boolean[] b=new boolean[a.length];
	for (int i = 0; i < a.length; i++) {
		int count;
		if(b[i]==false) {
			count=1;
			for (int j = i+1; j < b.length; j++) {
				if(a[i]==a[j]) {
					count++;
					b[j]=true;
				}
			}
			System.out.println(a[i]+ " duplicate of this count: "+ count);
		}
		
	}
}
}
