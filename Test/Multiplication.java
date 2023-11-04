package Test;

public class Multiplication {
	public static void main(String[] args) {
		int[][]a= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b= {{5,1,9},{2,3,4},{7,11,8}};
		int[][] c=new int[a.length][b.length];	
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
			
         for (int k = 0; k < c.length; k++) {
			c[i][j]+=a[i][k]*b[k][j];
		}
 	//	System.out.print(c[i][j]+" ");
  		System.out.printf("%4d", c[i][j]);

    }
			System.out.println();
	}


	}}
