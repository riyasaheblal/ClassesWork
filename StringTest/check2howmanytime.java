package StringTest;

public class check2howmanytime {
public static void main(String[] args) {
	int[] a= {37,823,122,2322,6017};
	int maincount=0;
    int number=0;
	for (int i = 0; i < a.length; i++) {
		int n=a[i];
		int count=ShowTwo(n);
		System.out.println(a[i]+ " "+ count);
		if(count>maincount) {
			maincount=count;
			number=a[i];
		}
	}
	System.out.println(maincount+" of the number "+ number);

}

private static int ShowTwo(int n) {
    int count=0;
    while(n>0) {
    	int d=n%10;
    //	System.out.println(d);
    	if(d==2) {
    		count++;
    	}
    	n=n/10;
    }
	return count;
}
}
