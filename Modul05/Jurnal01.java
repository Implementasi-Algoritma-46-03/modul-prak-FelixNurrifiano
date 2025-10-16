import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
       Scanner sc = new Scanner(System.in);
       int M = sc.nextInt();
       int N = sc.nextInt();
       String makanan = ".000";
       switch (M) {
        case 1 : System.out.println("Nasi Goreng "  +  N  +  " buah, total harga Rp. "  +  N * 15 + (""+ makanan));
        break;
        case 2 : System.out.println("Mie Goreng / Nyemek "  +  N  +  " buah, total harga Rp. "  +  N * 18 + (""+ makanan));
        break;
        case 3 : System.out.println("Kwetiau Goreng / Nyemek "  +  N  +  " buah, total harga Rp. "  +  N * 20 + (""+ makanan));
        break;
        case 4 : System.out.println("Capcay Goreng / Kuah "  +  N  +  " buah, total harga Rp. "  +  N * 23 + (""+ makanan));
        break;

       }
}
}
