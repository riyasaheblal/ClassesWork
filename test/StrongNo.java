package test;

public class StrongNo {
public static void main(String[] args) {
	int n=147;
	int temp=n;
	int sum=0;
	while(n>0)
	{
		int d=n%10;
//		int fact=1;
//
//		//System.out.println(d);
//		for(int i=1;i<=d;i++) {
//			fact=fact*i;
//		//	System.out.println(fact);
//
//		}
		sum=sum+fact(d);
		//System.out.println(sum);
		n=n/10;
	}
	if(sum==temp) {
		System.out.println("Its strong::"+ temp);
	}else {
		System.out.println("weak no::"+temp);
	}
}

  static int fact(int d) {
	  int fact=1;

		//System.out.println(d);
		for(int i=1;i<=d;i++) {
			fact=fact*i;
		//	System.out.println(fact);

		}
	return fact;
}
}
