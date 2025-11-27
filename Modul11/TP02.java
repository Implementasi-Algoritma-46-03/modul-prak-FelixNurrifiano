import java.util.Arrays;
import java.util.Scanner;

public class TP02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] poin = new int[N];

        for (int i = 0; i < N; i++) {
            poin[i] = sc.nextInt();
        }

        Arrays.sort(poin);

        for (int i = N - 1; i >= 0; i--) {
            System.out.print(poin[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}
