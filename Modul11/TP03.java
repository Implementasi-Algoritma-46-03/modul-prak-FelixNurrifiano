public class TP03 {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        String kalimat = sc.nextLine().trim();

        if (kalimat.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] kata = kalimat.split("\\s+");

        System.out.println(kata.length);
    }
}