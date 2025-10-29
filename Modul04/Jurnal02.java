public class Jurnal02 {

    public static void main(final String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N = sc.nextInt();
        double persenPajak;
        if (N >= 0 && N <= 50) {
            persenPajak = 0.05;
        } else if (N <= 250) {
            persenPajak = 0.15;
        } else if (N <= 500) {
            persenPajak = 0.25;
        } else {
            persenPajak = 0.30;
        }
        long pajak = (long)(N * 1000000 * persenPajak);
        long penghasilanBersih = N * 1000000 - pajak;
        System.out.println("Penghasilan kotor = " + N + " juta Rupiah");
        System.out.println("Pajak " + (int)(persenPajak*100) + "% = Rp. " + pajak);
        System.out.println("Penghasilan bersih = Rp. " + penghasilanBersih);
    }
}
