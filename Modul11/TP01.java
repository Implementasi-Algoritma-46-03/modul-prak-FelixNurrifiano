public class TP01 {

    public static void main(final String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        String[] peserta = new String[N];

        for (int i = 0; i < N; i++) {
            peserta[i] = sc.nextLine();
        }

        for (int i = 0; i < N; i++) {
            System.out.println("Bulan " + (i + 1) + ": " + peserta[i]);
        }
    }
}