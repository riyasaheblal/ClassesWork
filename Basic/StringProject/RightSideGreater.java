package Basic.StringProject;

import java.util.Iterator;

public class RightSideGreater {
	public static void main(String[] args) {
//         i<j	         j==size
//index 0  16<17  break  1==6  NO
//index 1  17<4,3,5,2    6==6  yes
//index 2  4<3,5  break  4==6  No
//index 3  3<5    break  4==6  NO
//index 4  5<2    false  6==6  yes
//index 5  2<2    false  6==6  yes
		int a[]= {16,17,4,3,5,2};
		for (int i = 0; i < a.length; i++) {
			int j;
			for (j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					break;
				}
			}
			if(j==a.length) {
				System.out.println(a[i]+" ");
			}
		}
	}
}
