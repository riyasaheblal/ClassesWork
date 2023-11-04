package Test;

public class Armstrong {
	//153=1^3+5^3+3^3=153
public static void main(String[] args) {
	int n=153;
	int sum=0;
	int temp=n;
	int dcount=count(n);
	while(n>0) {
		int d=n%10;
		sum+=prod(d,dcount);
		n=n/10;
	}
	if(sum==temp) {
		System.out.println("Its an Armstrong: "+temp);
	}
}

private static int prod(int d, int dcount) {
	int prod=1;
	for (int i = 1; i<=dcount; i++) {
		prod*=d;
	}
		return prod;
	}

private static int count(int n) {
	int count=0;
	while(n>0) {
		count++;
		n=n/10;
	}
	return count;
}
}
