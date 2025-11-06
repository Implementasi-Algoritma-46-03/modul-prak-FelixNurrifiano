import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int angka;

        do {
            angka = sc.nextInt();
            total += angka;
        } while (angka != 0);

        sc.close();

        System.out.println(total);
    }
}