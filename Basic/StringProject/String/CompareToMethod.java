package Basic.StringProject.String;

public class CompareToMethod {
public static void main(String[] args) {
	String s[]= {"Vivek", "Jagruti","Tanvi","SimpleLogic"};
	
	for (int i = 0; i < s.length; i++) {
		for (int j = i+1; j < s.length; j++) {
			if(s[i].compareTo(s[j])>0) {
		        String temp=s[i];
				s[i]=s[j];
				s[j]=temp;
				
			}
		}
		
	}
	for (int i = 0; i < s.length; i++) {
		System.out.print(s[i]+" ");
	}
}
}