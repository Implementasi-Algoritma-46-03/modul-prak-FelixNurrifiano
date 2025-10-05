import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double transaksiAwal = scanner.nextDouble();
        double diskon = 0.0;
        
        if (transaksiAwal > 200000.0) {
            diskon = transaksiAwal * 0.05;
        }

        double totalSetelahDiskon = transaksiAwal - diskon;
        double ppn = totalSetelahDiskon * 0.11;
        double totalDibayar = totalSetelahDiskon + ppn;

        System.out.printf("Transaksi = %.0f\n", transaksiAwal);
        
        if (diskon > 0) {
            System.out.printf("Total = %.0f - %.0f\n", transaksiAwal, diskon);
        } else {
            System.out.printf("Total = %.0f\n", transaksiAwal);
        }
        
        System.out.printf("Ppn 11%% = %.1f\n", ppn);
        System.out.printf("Total dibayar = %.1f\n", totalDibayar);
        
        scanner.close();
    }
}