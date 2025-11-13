import java.util.Scanner;

public class Jurnal03c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.close();

        int sum = 0;

        for (int i = 2; i <= N; i++) {
            int prima = 1;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    prima = 0;
                    break;
                }
            }
            if (prima == 1) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}