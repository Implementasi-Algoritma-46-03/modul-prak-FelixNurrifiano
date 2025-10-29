public class Jurnal01 {

    public static void main(final String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N = sc.nextInt();
        int lembar = N / 1000;
        int sisa = N % 1000;
        System.out.println(lembar);
        System.out.println(sisa);
    }
}
