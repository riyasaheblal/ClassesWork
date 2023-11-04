package Basic;

import java.util.Scanner;

public class scaneerusenextline {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int number=sc.nextInt();
	System.out.println("Enter percentage");
    double percentage=sc.nextDouble();
    //sc.nextLine();
	System.out.println("Enter Name");
    String Name=sc.next(sc.nextLine());
    System.out.println(number);
    System.out.println(percentage);
    System.out.println(Name);
}
}
