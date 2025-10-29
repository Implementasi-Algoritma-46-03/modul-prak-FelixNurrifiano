public class TP02 {

    public static void main(final String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N = sc.nextInt();

        String[] hariPerancis = {"lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche"};
        int hariHariIni = 4;
        int indeksHariN = (hariHariIni + N) % 7;

        System.out.println(hariPerancis[indeksHariN]);
    }
}
