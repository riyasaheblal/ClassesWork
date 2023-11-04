package Basic;

import java.util.Scanner;

public class LearnScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int Outsize=sc.nextInt();
		int Insize=sc.nextInt();
		int[][] a=new int[Outsize][Insize];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter the value");
				a[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
	}

}
