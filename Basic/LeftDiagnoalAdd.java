package Basic;

public class LeftDiagnoalAdd {
	// 3X3 matrix output
// \1\ 4 7
//	2 \5\ 8
//	3  6 \9\
	
	
	public static void main(String[] args) {
		int [][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(i==j) {
					sum+=a[i][j];
				}
			}
		}
		System.out.println(sum+" : sum off left dignoal");

	}
}

