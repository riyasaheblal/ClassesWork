package Basic;

public class SingledigitorMagic {
	//195 -> 1+9+5->15 //15>=10 -> in loop// 1+5->6 //6>=10 -> outloop 

	public static void main(String[] args) {
		int n=195;
		int temp=n;
		while(temp>=10)   
		{			
			int sum=0;
			while(temp>0) {
				int d=temp%10;
				sum=sum+d; //1+9+5
				temp=temp/10;
			}
			temp=sum;
		}	
		System.out.println("single digit::"+ temp );
	}
}
