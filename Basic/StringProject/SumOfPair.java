package Basic.StringProject;

public class SumOfPair {
public static void main(String[] args) {
	//1+2+6=9 //
			int a[]= {1,2,6,3,9,11,7,5};
			int sum=10;
			int count=0;
			for (int i = 0; i < a.length; i++) {
				for (int j = i+1; j < a.length; j++) {
					//if u want 1 data only so
//					if(count==2) {      //count==1 so we get one count
//						break;
//					}
					for (int k = j+1; k < a.length; k++) {
						if(a[i]+a[j]+a[k]==sum) {
							count++;
							System.out.println("{"+a[i]+","+a[j]+","+a[k]+"}");
						}
					}
				}
			}
			System.out.println(count);
		}
	}
