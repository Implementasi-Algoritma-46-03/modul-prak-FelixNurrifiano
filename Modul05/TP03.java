public class TP03 {

    public static void main(final String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String bangun = sc.nextLine();
        
        switch (bangun.toLowerCase()) {
            case "persegi":
                int sisi = sc.nextInt();
                int luasPersegi = sisi * sisi;
                int kelilingPersegi = 4 * sisi;
                System.out.println(luasPersegi + " " + kelilingPersegi);
                break;
            case "persegi panjang":
                int panjang = sc.nextInt();
                int lebar = sc.nextInt();
                int luasPP = panjang * lebar;
                int kelilingPP = 2 * (panjang + lebar);
                System.out.println(luasPP + " " + kelilingPP);
                break;
            case "segitiga":
                int alas = sc.nextInt();
                int tinggi = sc.nextInt();
                double luasSegitiga = 0.5 * alas * tinggi;
                double kelilingSegitiga = alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi);
                System.out.println(luasSegitiga + " " + kelilingSegitiga);
                break;
            case "lingkaran":
                double diameter = sc.nextDouble();
                double pi = 3.14;
                double jari = diameter / 2;
                double luasLingkaran = pi * jari * jari;
                double kelilingLingkaran = pi * diameter;
                System.out.println(luasLingkaran + " " + kelilingLingkaran);
                break;
            default:
                System.out.println("Bangun datar tidak dikenali");
        }
    }
}
