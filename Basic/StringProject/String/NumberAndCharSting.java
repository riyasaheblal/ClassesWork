package Basic.StringProject.String;

public class NumberAndCharSting {
public static void main(String[] args) {
	//M3UM2B4A7I --> MUMBAI //mumbai count 6 // and rest of the number add =
	//3+2+4+7=16 my o/p=  MUMBAI 6 16
	String s="M3UM2B4A7I";
     char[] ch=s.toCharArray();
     int count=0;
     int sum=0;
    for (int i = 0; i < s.length(); i++) {
		if (ch[i]>='A' && ch[i]<='Z') {
			count++;
			System.out.print(ch[i]);
		}
		else {
			sum+=ch[i]-48;
		}
	}
    System.out.print(" "+count);
    System.out.print(" "+sum);
    
}
}
