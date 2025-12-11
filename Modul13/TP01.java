public class TP01 {

    public static void main(final String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        double[] wave1 = new double[10];
        double[] wave2 = new double[10];

        for (int i = 0; i < 10; i++) {
            wave1[i] = sc.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            wave2[i] = sc.nextDouble();
        }

        java.util.Arrays.sort(wave1);
        java.util.Arrays.sort(wave2);

        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f", wave1[i]);
            if (i < 9) System.out.print(" ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f", wave2[i]);
            if (i < 9) System.out.print(" ");
        }
        System.out.println();
    }
}
