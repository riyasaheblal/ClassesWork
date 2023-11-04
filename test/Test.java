package test;


public class Test {
    public static void main(String[] args) {
        int n = 78; // 15
        int temp = n;
        
        while (temp >= 10) {
            int sum = 0;
            while (temp > 0) {
                int d = temp % 10;
                sum = sum + d;
                temp = temp / 10;
            }
            temp = sum;
        }

        System.out.println("The single-digit sum is: " + temp);
    }
}


