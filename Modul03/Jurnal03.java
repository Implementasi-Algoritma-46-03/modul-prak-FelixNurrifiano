import java.util.Scanner;
public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        int P = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        double nilaiAkhir = (0.25 * P) + (0.35 * A) + (0.40 * B);

        boolean statusLulus = nilaiAkhir >= 75.0;

        System.out.printf("%.2f%n", nilaiAkhir);
        System.out.println("Lulus MK: " + statusLulus);

        scanner.close();
    }
}