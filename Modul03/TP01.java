import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        long X = input.nextLong();
        long Y = input.nextLong();
        long N = input.nextLong();
        long total = X + (Y * N);
        System.out.println(total);
        input.close();
    }
}
