public class Jurnal03 {

    public static void main(final String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int D = sc.nextInt();
        int R = sc.nextInt();
        int I = sc.nextInt();

        if (D < R && D < I) {
            if (R < I) {
                System.out.println("Dira, Radi, Idar");
            } else {
                System.out.println("Dira, Idar, Radi");
            }
        } else if (R < D && R < I) {
            if (D < I) {
                System.out.println("Radi, Dira, Idar");
            } else {
                System.out.println("Radi, Idar, Dira");
            }
        } else {
            if (D < R) {
                System.out.println("Idar, Dira, Radi");
            } else {
                System.out.println("Idar, Radi, Dira");
            }
        }
    }
}
