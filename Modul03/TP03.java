import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        int N = scanner.nextInt();

        int totalOrang = N + 1;

        int jatahPermen = T / totalOrang;

        int sisaPermen = T % totalOrang;

        System.out.println(jatahPermen);
        System.out.println(sisaPermen);
    }
}