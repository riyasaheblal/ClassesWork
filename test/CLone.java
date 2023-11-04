package test;

public class CLone implements Cloneable {
	int j=10;
	
@Override
	public String toString() {
		return "CLone [j=" + j + "]";
	}

public static void main(String[] args) throws CloneNotSupportedException {
	CLone c=new CLone();
	CLone c1=(CLone)c.clone();
System.out.println(c);
	System.out.println(c1);
}
}
