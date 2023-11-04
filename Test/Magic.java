package Test;

public class Magic {
	public static void main(String[] args) {
		int[] a= {1,2,1,3,3,4,1,3,4,18,1,2,5,18};
		//        f f f f f f f f f  f f f f  f
		boolean[] b= new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			int count;
           if(b[i]==false) {
        	  count=1;
        	  for (int j = i+1; j < b.length; j++) {
				if(a[i]==a[j]) {
					count++;
					b[j]=true;
				}
			}
        	  System.out.println(a[i]+" duplicate==>"+count);
           }
		}

	}

}
