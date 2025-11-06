import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();
        sc.close();

        int asli = angka;
        int jumlah = 0;

        while (angka > 0) {
            int digit = angka % 10;
            int fakt = 1;
            for (int i = 2; i <= digit; i++) {
                fakt *= i;
            }
            jumlah += fakt;
            angka /= 10;
        }

        System.out.println(jumlah == asli ? "YA" : "BUKAN");
    }
}
