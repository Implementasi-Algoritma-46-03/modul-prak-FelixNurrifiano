import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int balik = 0;
        int angka = N;

        while (angka > 0) {
            int digit = angka % 10;
            balik = balik * 10 + digit;
            angka /= 10;
        }

        System.out.println(balik);
    }
}