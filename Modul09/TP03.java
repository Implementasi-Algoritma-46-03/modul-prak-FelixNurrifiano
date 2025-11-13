import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        long hasil = faktorial(N);
        System.out.println(hasil);
        input.close();
    }

    public static long faktorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }
}