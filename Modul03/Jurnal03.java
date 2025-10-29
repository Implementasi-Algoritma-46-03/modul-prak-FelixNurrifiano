public class Jurnal03 {

    public static void main(final String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double P = sc.nextDouble();
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double NA = 0.25 * P + 0.35 * A + 0.40 * B;
        System.out.printf("%.2f%n", NA);
        System.out.println("Lulus MK: " + (NA >= 75));
    }
}
