package test;

public class SingleDigitSum {
    public static void main(String[] args) {
        int n = 678;
        
        int sum = 0;
        do {
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            
            n = sum;
            sum = 0;
        } while (n >= 10);
        
        System.out.println("The single-digit sum is: " + n);
    }
}
