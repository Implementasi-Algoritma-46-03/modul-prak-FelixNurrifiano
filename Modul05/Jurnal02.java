import java.util.Scanner;

public class Jurnal02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String hari = scanner.nextLine().trim();
        int n = scanner.nextInt();

        int indexHari = -1;

        switch (hari.toLowerCase()) {
            case "senin":
                indexHari = 0;
                break;
            case "selasa":
                indexHari = 1;
                break;
            case "rabu":
                indexHari = 2;
                break;
            case "kamis":
                indexHari = 3;
                break;
            case "jumat":
                indexHari = 4;
                break;
            case "sabtu":
                indexHari = 5;
                break;
            case "minggu":
                indexHari = 6;
                break;
            default:
                System.out.println("Nama hari tidak valid.");
                scanner.close();
                return;
        }

        int indexHariBaru = (indexHari + n) % 7;

        String hariBaru;

        switch (indexHariBaru) {
            case 0:
                hariBaru = "Senin";
                break;
            case 1:
                hariBaru = "Selasa";
                break;
            case 2:
                hariBaru = "Rabu";
                break;
            case 3:
                hariBaru = "Kamis";
                break;
            case 4:
                hariBaru = "Jumat";
                break;
            case 5:
                hariBaru = "Sabtu";
                break;
            case 6:
                hariBaru = "Minggu";
                break;
            default:
                hariBaru = "Error";
                break;
        }

        System.out.println(hariBaru);

        scanner.close();
    }
}