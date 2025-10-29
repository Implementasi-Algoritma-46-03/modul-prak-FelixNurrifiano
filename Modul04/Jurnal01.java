public class Jurnal01 {

    public static void main(final String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N = sc.nextInt();
        if (24 % N == 0 && 56 % N == 0) {
            System.out.println(N + " adalah faktor dari 24 dan 56");
        } else {
            System.out.println(N + " bukan faktor dari 24 dan 56");
        }
    }
}
