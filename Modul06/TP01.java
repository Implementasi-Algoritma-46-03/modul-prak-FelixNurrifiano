import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(java.util.Locale.US);  // <-- ini penting!

        double R1 = input.nextDouble();
        double R2 = input.nextDouble();
        double R3 = input.nextDouble();

        double C1 = fahrenheitKeCelcius(R1);
        double C2 = fahrenheitKeCelcius(R2);
        double C3 = fahrenheitKeCelcius(R3);

        double Re1 = fahrenheitKeReamur(R1);
        double Re2 = fahrenheitKeReamur(R2);
        double Re3 = fahrenheitKeReamur(R3);

        System.out.printf("%.2f %.2f %.2f\n", C1, C2, C3);
        System.out.printf("%.2f %.2f %.2f\n", Re1, Re2, Re3);

        input.close();
    }

    public static double fahrenheitKeCelcius(double f) {
        return (5.0 / 9.0) * (f - 32);
    }

    public static double fahrenheitKeReamur(double f) {
        return (4.0 / 9.0) * (f - 32);
    }
}