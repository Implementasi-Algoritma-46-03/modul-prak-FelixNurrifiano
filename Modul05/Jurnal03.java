import java.util.Scanner;

public class Jurnal03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        char O = scanner.next().charAt(0);
        int B = scanner.nextInt();

        switch (O) {
            case '+':
                System.out.println(A + B);
                break;
            case '-':
                System.out.println(A - B);
                break;
            case '*':
                System.out.println(A * B);
                break;
            case '/':
                // Pembagian hasilnya riil (double)
                if (B == 0) {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                } else {
                    double hasil = ((double) A / B);
                    System.out.printf("%.7f", hasil );
                }
                break;
            default:
                System.out.println("Operator tidak valid.");
        }
    }
