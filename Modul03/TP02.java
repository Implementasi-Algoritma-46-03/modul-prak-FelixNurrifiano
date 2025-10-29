import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = input.next();
        int jumlah = input.nextInt();
        int harga = input.nextInt();
        int total = jumlah * harga;
        System.out.println("Hi, " + nama + ". Total belanja adalah " + total + " rupiah.");
        input.close();
    }
}
