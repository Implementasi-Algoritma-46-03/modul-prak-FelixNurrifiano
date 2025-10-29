public class Jurnal02 {

    public static void main(final String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double rata = (a + b + c) / 3;
        System.out.printf("Nilai rata-rata: %.2f", rata);
    }
}
