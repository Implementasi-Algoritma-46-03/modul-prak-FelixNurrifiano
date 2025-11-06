import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int N = sc.nextInt();
        sc.close();

        double sisa = R;
        int hari = N;

        if (N >= 10) {
            do {
                sisa /= 2.0;
                hari -= 10;
            } while (hari >= 10);
        }

        System.out.printf("%.3f\n", sisa);
    }
}