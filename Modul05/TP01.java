import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
    //memunculkan Bulan
    String bulan = input.nextLine();
    String bulanPrancis;
    switch (bulan) {
        case "januari":
            bulanPrancis = "janvier";
            break;
        case "februari":
            bulanPrancis = "fevrier";
            break;
        case "maret":
            bulanPrancis = "mars";
            break;
        case "april":
            bulanPrancis = "avril";
            break;
        case "mei":
            bulanPrancis = "mai";
            break;
        case "juni":
            bulanPrancis = "juin";
            break;
        case "juli":
            bulanPrancis = "juillet";
            break;
        case "agustus":
            bulanPrancis = "aout";
            break;
        case "september":
            bulanPrancis = "septembre";
            break;
        case "oktober":
            bulanPrancis = "oktobre";
            break;
        case "november":
            bulanPrancis = "novembre";
            break;
        case "desember":
            bulanPrancis = "decembre";
            break;
        default:
            bulanPrancis = "bulan tidak valid";
            break;
    }
    
    System.out.println(bulanPrancis);
}
}