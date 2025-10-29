import java.util.Scanner;

public class Jurnal03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        char O = sc.next().charAt(0);
        int B = sc.nextInt();

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
                if (B == 0) {
                    System.out.println("Error: Pembagian dengan nol");
                } else {
                    double hasil = (double) A / B;
                    System.out.printf("%.7f\n", hasil); // 7 digit di belakang koma
                }
                break;
            default:
                System.out.println("Operator tidak valid");
        }
    }
}
