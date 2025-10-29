public class TP01 {

    public static void main(final String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String bulan = sc.nextLine().toLowerCase();
        switch (bulan) {
            case "januari":
                System.out.println("janvier");
                break;
            case "september":
                System.out.println("septembre");
                break;
            default:
                System.out.println("Bulan tidak valid");
        }
    }
}
