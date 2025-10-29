public class TP03 {

    public static void main(final String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int total = T + 1;
        int jatah = N / total;
        int sisa = N % total;
        System.out.println(jatah);
        System.out.println(sisa);
    }
}
