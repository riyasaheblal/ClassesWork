package test;

public class Finalized {
	
	public static void main(String[] args) {
		 new Finalized();
		 Finalized f=new Finalized();
		 f=null;
		 Finalized f1=new Finalized();
		 Finalized f2=new Finalized();
		 f1=f2;
		 System.gc();

		 
	}
	
	@Override
	public void finalize() {
		System.out.println("Garbage remove");
	}

}
