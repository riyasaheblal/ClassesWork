package Test;

public class A2 {

    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int b[] = {4, 5, 6};

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(",");
            }
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print("," + b[i]);
        }
    }
}
