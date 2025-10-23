import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        String lirik = input.nextLine();

        int panjang = lirik.length();


        char vokalPengganti = tentukanVokal(panjang);


        String hasil = ubahVokal(lirik, vokalPengganti);


        System.out.println(hasil);

        input.close();
    }


    public static char tentukanVokal(int panjang) {
        int sisa = panjang % 5;

        switch (sisa) {
            case 0:
                return 'a';
            case 1:
                return 'e';
            case 2:
                return 'i';
            case 3:
                return 'o';
            default:
                return 'u';
        }
    }

    public static String ubahVokal(String teks, char vokalBaru) {
        String hasil = "";

        for (int i = 0; i < teks.length(); i++) {
            char c = teks.charAt(i);
            if (isVokal(c)) {
                hasil += vokalBaru;
            } else {
                hasil += c;
            }
        }

        return hasil;
    }

    public static boolean isVokal(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o');
    }
}