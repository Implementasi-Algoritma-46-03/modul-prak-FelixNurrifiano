import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String Bangundatar = sc.nextLine().toLowerCase();
        double pi = 3.14; 
        double luas = 0, keliling = 0; 
        switch (Bangundatar) {

            case "persegi" : 
                int sisi = sc.nextInt();
                luas = sisi * sisi;
                keliling = 4 * sisi;
                System.out.print((int)luas+" "+(int)keliling);
                break;
            case "persegi panjang":
                int panjang = sc.nextInt();
                int lebar = sc.nextInt();
                luas = panjang * lebar;
                keliling = 2 * (panjang + lebar);
                System.out.print((int)luas + " " + (int)keliling);
                break;
            case "segitiga" :
                int alas = sc.nextInt();
                int tinggi = sc.nextInt();
                luas = 0.5 * alas * tinggi;
                keliling = alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi);
                System.out.print((int)luas+ " " +(int)keliling);
                break;
            case "lingkaran" :
                int diameter = sc.nextInt();
                luas = pi * (diameter / 2) * (diameter / 2);
                keliling = pi * diameter;
                System.out.printf("%.2f %.2f\n", luas, keliling);
                break;
    }
}
}
