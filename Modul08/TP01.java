import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int amoeba = 30;
        int menit = 0;

        while (amoeba < N) {
            amoeba *= 2;
            menit += 15;
        }

        System.out.println(menit);
    }
}