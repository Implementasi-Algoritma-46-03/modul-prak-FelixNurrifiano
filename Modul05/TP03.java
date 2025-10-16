import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        String bangun = input.nextLine();
        double luas = 0, keliling = 0;

        switch (bangun) {
            case "Persegi":
                int sisi = input.nextInt();
                luas = sisi * sisi;
                keliling = 4 * sisi;
                break;

            case "Persegi Panjang":
                int panjang = input.nextInt();
                int lebar = input.nextInt();
                luas = panjang * lebar;
                keliling = 2 * (panjang + lebar);
                break;

            case "Segitiga":
                int alas = input.nextInt();
                int tinggi = input.nextInt();
                luas = (alas * tinggi) / 2.0;
                double miring = Math.sqrt(alas * alas + tinggi * tinggi);
                keliling = alas + tinggi + miring;
                break;

            case "Lingkaran":
                int diameter = input.nextInt();
                double r = diameter / 2.0;
                luas = 3.14 * r * r;
                keliling = 3.14 * diameter;
                break;

            default:
                System.out.println("Bangun datar tidak dikenali");
                input.close();
                return;
        }

        // Jika hasilnya bilangan bulat, tampilkan tanpa desimal
        if (luas % 1 == 0 && keliling % 1 == 0) {
            System.out.printf("%.0f %.0f%n", luas, keliling);
        } else {
            System.out.printf("%.2f %.2f%n", luas, keliling);
        }

        input.close();
    }
}
