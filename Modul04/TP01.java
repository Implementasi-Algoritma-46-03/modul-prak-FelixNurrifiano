public class TP01 {

    public static void main(final String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N = sc.nextInt();
        if (N % 6 == 0) {
            System.out.println("Kelipatan Enam");
        } else {
            System.out.println("Bukan kelipatan enam");
        }
    }
}
