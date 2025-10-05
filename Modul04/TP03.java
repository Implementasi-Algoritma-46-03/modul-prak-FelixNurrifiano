import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int D = scanner.nextInt(); // Nilai Dira
        int R = scanner.nextInt(); // Nilai Radi
        int I = scanner.nextInt(); // Nilai Idar

        if (D > R && D > I) {
            System.out.println("Dira");
        } else if (R > I) {
            System.out.println("Radi");
        } else {
            System.out.println("Idar");
        }

        scanner.close();
    }
}