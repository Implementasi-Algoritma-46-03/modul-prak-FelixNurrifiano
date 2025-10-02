public class Jurnal01 {

    public static void main(final String[] args) {
    
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        int N = scanner.nextInt();
        
        final int PECAHAN = 1000;
        
        int jumlahLembar = N / PECAHAN;
        
        int sisaUang = N % PECAHAN;
        
        System.out.println(jumlahLembar);
        System.out.println(sisaUang);
        
        scanner.close();
    }
}