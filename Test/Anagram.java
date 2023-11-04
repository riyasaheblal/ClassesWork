package Test;

public class Anagram {
	public static void main(String[] args) {
		String s1="cat";
		String s2="act";
		if(s1.length()!=s2.length()) {
			System.out.println("Not an Anagram");
		}
		else {
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			for (int i = 0; i < ch1.length; i++) {
				for (int j = i+1; j < ch1.length; j++) {
					if(ch1[i]>ch1[j]) {
						char temp=ch1[i];
						ch1[i]=ch1[j];
						ch1[j]=temp;
					}
					if(ch2[i]>ch2[j]) {
						char temp=ch2[i];
						ch2[i]=ch2[j];
						ch2[j]=temp;
					}

				}

			}
			String st1= new String(ch1);
			String st2= new String(ch2);

			if(st1.equals(st2)) {
				System.out.println("its an anagram"+ " " +st1 + " "+ st2);
			}
			else {
				System.out.println("not same " + st1 +" "+st2);
			}

		}
	}
}
