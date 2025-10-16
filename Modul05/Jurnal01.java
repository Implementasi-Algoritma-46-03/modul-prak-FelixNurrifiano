import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kodeMenu = scanner.nextInt();
        int jumlah = scanner.nextInt();

        String namaMakanan = "";
        int harga = 0;

        switch (kodeMenu) {
            case 1:
                namaMakanan = "Nasi Goreng";
                harga = 15000;
                break;
            case 2:
                namaMakanan = "Mie Goreng / Nyemek";
                harga = 18000;
                break;
            case 3:
                namaMakanan = "Kwetiau Goreng / Nyemek";
                harga = 20000;
                break;
            case 4:
                namaMakanan = "Capcay Goreng / Kuah";
                harga = 23000;
                break;
            default:
                System.out.println("Kode menu tidak tersedia.");
                scanner.close();
                return;
        }

        int totalHarga = jumlah * harga;

        // Format angka dengan titik ribuan, lalu tambahkan "Rp."
        String totalHargaFormatted = String.format("%,d", totalHarga).replace(',', '.');

        System.out.println(namaMakanan + " " + jumlah + " buah, total harga Rp. " + totalHargaFormatted);

        scanner.close();
    }
}

