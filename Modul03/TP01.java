import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int N = scanner.nextInt();

        int total = X + (Y * N);

        System.out.println(total);

        scanner.close();
    }
}
