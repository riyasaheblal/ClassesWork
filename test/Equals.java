package test;

public class Equals {
	int j=10;

//	@Override
//	public String toString() {
//		return "Equals [j=" + j + "]";
//	}
	
	@Override
	public boolean equals(Object obj) {
		Equals ref2=(Equals)obj;
		return this.j==ref2.j;
		
	}

	public static void main(String[] args) {
		Equals ref=new Equals();
		System.out.println(ref);
		Equals ref2=new Equals();
		System.out.println(ref);
		System.out.println(ref.equals(ref2));

		
	}

}
