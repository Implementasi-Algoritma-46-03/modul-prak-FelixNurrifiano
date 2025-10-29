public class TP02 {

    public static void main(final String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N = sc.nextInt();
        double diskon = 0;
        if (N > 200000) {
            diskon = 0.05 * N;
        }
        double total = N - diskon;
        double ppn = 0.11 * total;
        double totalBayar = total + ppn;
        if (diskon > 0) {
            System.out.println("Transaksi = " + N);
            System.out.println("Total = " + N + " - " + (int)diskon);
        } else {
            System.out.println("Transaksi = " + N);
            System.out.println("Total = " + N);
        }
        System.out.println("Ppn 11% = " + ppn);
        System.out.println("Total dibayar = " + totalBayar);
    }
}
