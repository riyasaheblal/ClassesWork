package Test;

public class Dimension {
public static void main(String[] args) {
	int[][] a= {{1,2,3},{4,5,6},{3,8,9}};
	//int sum=0;

	for (int i = 0; i < a.length; i++) {
	//	System.out.println(a[i][i]);
     //  sum+=a[i][i];
		int sum=0;
		for (int j = 0; j < a[i].length; j++) {
		//	System.out.print(a[i][j]+" ");   //matrix
		//	sum+=a[i][j];
			//System.out.print(a[j][i]+" ");    //transpose
			sum+=a[i][j];
//			if(i==j) {
//				
//				sum+=a[i][j];
//			}

		}
		System.out.println(sum);

	//	System.out.println();

	}

}
}
