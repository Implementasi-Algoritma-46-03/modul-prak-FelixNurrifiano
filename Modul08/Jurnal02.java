import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah;
        int total = 0;
        int hitung = 0;

        do {
            jumlah = sc.nextInt();
            if (jumlah != 0) {
                total += jumlah;
                hitung++;
            }
        } while (jumlah != 0);

        sc.close();

        double rataRata = (double) total / hitung;
        System.out.printf("%.2f\n", rataRata);
    }
}
