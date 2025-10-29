import java.util.Scanner;

public class Jurnal02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hariAwal = sc.nextLine();
        int N = sc.nextInt();

        int angkaHari = 0;

        switch (hariAwal.toLowerCase()) {
            case "senin": angkaHari = 0; break;
            case "selasa": angkaHari = 1; break;
            case "rabu": angkaHari = 2; break;
            case "kamis": angkaHari = 3; break;
            case "jumat": angkaHari = 4; break;
            case "sabtu": angkaHari = 5; break;
            case "minggu": angkaHari = 6; break;
            default:
                System.out.println("Nama hari tidak valid");
                return;
        }

        int hariSelanjutnya = (angkaHari + N) % 7;
        String hasilHari = "";

        switch (hariSelanjutnya) {
            case 0: hasilHari = "Senin"; break;
            case 1: hasilHari = "Selasa"; break;
            case 2: hasilHari = "Rabu"; break;
            case 3: hasilHari = "Kamis"; break;
            case 4: hasilHari = "Jumat"; break;
            case 5: hasilHari = "Sabtu"; break;
            case 6: hasilHari = "Minggu"; break;
        }

        System.out.println(hasilHari);
    }
}
