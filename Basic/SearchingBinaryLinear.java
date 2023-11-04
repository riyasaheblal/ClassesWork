package Basic;

public class SearchingBinaryLinear {
public static void main(String[] args) {
	int a[]= {6,4,5,3,1,2};
int n=10;
boolean flag=false;
for (int i = 0; i < a.length; i++) {
	if(a[i]==n) {
		System.out.println(n +" : This search is present at index : "+ i);
		flag=true;
		break;
	}
}
if(flag==false) {
	System.out.println(n +" : This search is not present");
}
}

}
