import java.util.Locale;
import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        double jari2 = input.nextDouble();
        double tabung = input.nextDouble();
        double air = input.nextDouble();


        double volumeMaks = hitungTabung(jari2, tabung);
        double volumeAir = hitungAir(jari2, air);
        double persen = hitungPersen(air, tabung);

  
        System.out.printf("%.2f %.2f %.1f%%\n", volumeMaks, volumeAir, persen);

        input.close();
    }

    public static double hitungTabung(double jari2, double tinggi) {
        return 3.1416 * jari2 * jari2 * tinggi;
    }
    
    public static double hitungAir(double jari2, double air) {
        return 3.1416 * jari2 * jari2 * air;
    }

    public static double hitungPersen(double air, double tabung) {
        return (air / tabung) * 100;
    }
}

