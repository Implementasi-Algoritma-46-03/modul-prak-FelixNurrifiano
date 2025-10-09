import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        int j = scanner.nextInt(); // j = jt

        double p; // p  = pjk
        int pp; // pp = persentase pjk

        if (j > 500) {
            p = 0.30;
            pp = 30;
        } else if (j > 250) {
            p = 0.25;
            pp = 25;
        } else if (j > 50) {
            p = 0.15;
            pp = 15;
        } else {
            p = 0.05;
            pp = 5;
        }

        long pk = (long) j * 1000000L; // pk = penghasil ktor
        
        long bp = (long) (pk * p); // besar pjk

        long pb = pk - bp; // pb pnghasilan brsih

        System.out.println("Penghasilan kotor = " + j + " juta Rupiah");
        System.out.println("Pajak " + pp + "% = Rp. " + bp);
        System.out.println("Penghasilan bersih = Rp. " + pb);

        scanner.close();
    }
}