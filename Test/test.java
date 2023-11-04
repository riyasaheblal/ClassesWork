package Test;

import java.util.Scanner;
import java.util.stream.Stream;

public class test {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int number=sc.nextInt();
		String sq=sc.next();
		sc.nextLine();
//		System.out.println("Enter your Percentage");
//		double per=sc.nextDouble();
//		sc.nextLine();
		System.out.println("Enter your name");
		String name=sc.nextLine();
		
		System.out.println("NAme : "+name);
		System.out.println("NAme : "+sq);

		//System.out.println("Percentage : "+per);
		System.out.println("Number : "+number);
	}

}
