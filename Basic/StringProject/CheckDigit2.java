package Basic.StringProject;

public class CheckDigit2 {
	public static void main(String[] args) {
		int[] a= {37,823,122,2322,6017,2222};
		int check=a[0];
		int count=0;


		for (int i = 0; i < a.length; i++) {
			int maxcount=test(a[i]);
			System.out.println(a[i]+" It contain two for "+maxcount+" times" );
			if(maxcount>count) {
				count=maxcount;
				check=a[i];
			}
	
		//	System.out.println(temp+" contain two "+ count+" times");

		}
		System.out.println(count +" is the max count of "+check  );


	}

	private static int test(int i) {
		
		int count=0;
		int temp=i;
		while(i>0) {
			int	d=i%10;
			if(d==2) {
				count++;
			}
			i=i/10;
		}		return count;
	}


}
