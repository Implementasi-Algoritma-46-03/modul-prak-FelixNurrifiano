public class Jurnal01 {

    public static void main(final String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int jumlah = sc.nextInt(); // jumlah makanan
        int kode = sc.nextInt();   // kode menu
        String menu = "";
        int hargaSatuan = 0;

        switch (jumlah) { // jumlah dipakai untuk memilih menu
            case 1:
                menu = "Nasi Goreng";
                hargaSatuan = 15000;
                break;
            case 2:
                menu = "Mie Goreng / Nyemek";
                hargaSatuan = 18000;
                break;
            case 3:
                menu = "Kwetiau Goreng / Nyemek";
                hargaSatuan = 20000;
                break;
            case 4:
                menu = "Capcay Goreng / Kuah";
                hargaSatuan = 23000;
                break;
            default:
                System.out.println("Kode menu tidak valid");
                return;
        }

        int totalHarga = kode * hargaSatuan; // kode dipakai sebagai jumlah
        String totalHargaFormatted = String.format("%,d", totalHarga).replace(',', '.');

        System.out.println(menu + " " + kode + " buah, total harga Rp. " + totalHargaFormatted);
    }
}
