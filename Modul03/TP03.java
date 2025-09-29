import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        int N = scanner.nextInt();

        int totalOrang = T + 1;

        int jatahPermen = N / totalOrang;

        int sisaPermen = N % totalOrang;

        System.out.println(jatahPermen);
        System.out.println(sisaPermen);

        scanner.close();
    }
}