package Basic;


public class ThirdLargest {
public static void main(String[] args) {
	int a[]= {79,87,5,8,78,54,44,90};
	int large=a[0];
	int sla=0;
	int tlar=0;
	for (int i = 0; i < a.length; i++) {
		if(a[i]>large) {
			tlar=sla;
			sla=large;
			large=a[i];
		}else if (a[i]>sla && a[i]!=sla) {
			sla=a[i];
		}else if (a[i]>tlar && a[i]!=sla && a[i]!=tlar) {
			tlar=a[i];
		}
	}
	System.out.println(large);
	System.out.println(sla);
	System.out.println(tlar);
}
}
