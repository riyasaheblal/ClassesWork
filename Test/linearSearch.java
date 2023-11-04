package Test;

public class linearSearch {
public static void main(String[] args) {
	int a[]= {2,5,7,3,8,9};
	int search=7;
	boolean flag=false;
	for (int i = 0; i < a.length; i++) {
		if(a[i]==search) {
			System.out.println("Its present:: "+a[i]+ " index "+ i);
			break;
		}
	}
	if(flag==false) {
		System.out.println("its not present");
	}
}

}
