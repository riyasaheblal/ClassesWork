package Basic;

public class ArrayMultiplication {
public static void main(String[] args) {
// 1 2 3    5 1  9   1*5+2*1+3*9   1*2+2*3+3*4  1*7+2*11+3*8  30   40  41
// 4 5 6  * 2 3  4 = 4*5+5*1+6*9   4*2+5*3+6*4  4*7+5*11+6*8= 72   85 104
// 7 8 9    7 11 8   7*5+8*1+9*9   7*2+8*3+9*4  7*7+8*11+9*8  114 130 167 
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
}
}
