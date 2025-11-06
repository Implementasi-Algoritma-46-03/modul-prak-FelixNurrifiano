import java.util.Scanner;

public class Jurnal03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();
        sc.close();

        int asli = angka, jumlah = 0;

        while (angka > 0) {
            int digit = angka % 10;
            int fakt = 1, n = digit;
            while (n > 1)
            fakt *= n--; 
            jumlah += fakt;
            angka /= 10;
        }

        System.out.println(jumlah == asli ? "YA" : "BUKAN");
    }
}