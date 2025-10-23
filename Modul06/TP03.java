import java.util.Scanner;

public class TP03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        String namaBangun = scanner.nextLine();
        
        String inputBilangan = scanner.nextLine();
        Scanner bilScanner = new Scanner(inputBilangan);
        
        if (namaBangun.equalsIgnoreCase("Persegi")) {
            int sisi = bilScanner.nextInt();
            System.out.println(luasPersegi(sisi) + " " + kelilingPersegi(sisi));
            
        } else if (namaBangun.equalsIgnoreCase("Persegi Panjang")) {
            int panjang = bilScanner.nextInt();
            int lebar = bilScanner.nextInt();
            System.out.println(luasPersegiPanjang(panjang, lebar) + " " + kelilingPersegiPanjang(panjang, lebar));
            
        } else if (namaBangun.equalsIgnoreCase("Segitiga")) {
            int alas = bilScanner.nextInt();
            int tinggi = bilScanner.nextInt();
            System.out.println(luasSegitiga(alas, tinggi) + " " + kelilingSegitiga(alas, tinggi));
            
        } else if (namaBangun.equalsIgnoreCase("Lingkaran")) {
            int diameter = bilScanner.nextInt();
            System.out.printf("%.2f %.2f\n", luasLingkaran(diameter), kelilingLingkaran(diameter));
        }
        
        bilScanner.close();
        scanner.close();
    }
    
    public static int luasPersegi(int sisi) {
        return sisi * sisi;
    }
    public static int kelilingPersegi(int sisi) {
        return 4 * sisi;
    }
    

    public static int luasPersegiPanjang(int panjang, int lebar) {
        return panjang * lebar;
    }
    public static int kelilingPersegiPanjang(int panjang, int lebar) {
        return 2 * (panjang + lebar);
    }
    
    public static int luasSegitiga(int alas, int tinggi) {
        return (alas * tinggi) / 2;
    }
    public static int kelilingSegitiga(int alas, int tinggi) {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return (int)(alas + tinggi + sisiMiring);
    }
    
    public static double luasLingkaran(int diameter) {
        double r = diameter / 2.0;
        return 3.14 * r * r;
    }
    public static double kelilingLingkaran(int diameter) {
        return 3.14 * diameter;
    }
}