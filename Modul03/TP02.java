import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
       
        String nama = scanner.next(); 
        

        int jumlahBarang = scanner.nextInt();
        

        int hargaPerBarang = scanner.nextInt();


        long totalBelanja = (long)jumlahBarang * hargaPerBarang; 


        System.out.println("Hi, " + nama + ". Total belanja adalah " + totalBelanja + " rupiah.");

        scanner.close();
    }
}