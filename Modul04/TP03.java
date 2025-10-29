public class TP03 {

    public static void main(final String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int D = sc.nextInt();
        int R = sc.nextInt();
        int I = sc.nextInt();
        if (D > R && D > I) {
            System.out.println("Dira");
        } else if (R > D && R > I) {
            System.out.println("Radi");
        } else {
            System.out.println("Idar");
        }
    }
}
