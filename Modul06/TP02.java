import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kalimat = scanner.nextLine();
        
        String hasil = hapusVokal(kalimat);
        System.out.println(hasil);
        
        scanner.close();
    }


    public static String hapusVokal(String input) {
        StringBuilder output = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!isVokal(ch)) {
                output.append(ch);
            }
        }
        
        return output.toString();
    }
    

    public static boolean isVokal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o';
    }
}
