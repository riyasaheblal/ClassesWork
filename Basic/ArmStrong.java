package Basic;

public class ArmStrong {

	
	public static void main(String[] args) {
		//153 -> count =3 -> 1^3+5^3+3^3=153
        int n=153;
        int dcount=Count(n);
        int temp=n;
        int sum=0;
        while(n>0) {
        	int d=n%10;
        	sum=sum+Prod(d,dcount);
        	n=n/10;
        }
        System.out.println("Sum is : "+ sum);
        if(sum==temp) {
        	System.out.println("ArmStrong : "+ temp);
        }else {
        	System.out.println("Not an ArmStrong : "+ temp);

        }
		
	}

	public static int Prod(int d, int dcount) {
		int prod=1;
		for(int i=1;i<=dcount;i++) {
			prod=prod*d;
		}
		return prod;
	}

	public static int Count(int n) {
		int dcount=0;
		while(n>0) {
			dcount++;
			n=n/10;
		}
		return dcount;
	}
}
