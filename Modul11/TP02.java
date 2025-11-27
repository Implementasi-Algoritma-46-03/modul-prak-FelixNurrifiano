import java.util.*;

public class TP02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;  
        int N = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        while (list.size() < N && sc.hasNextInt()) {
            list.add(sc.nextInt());
        }

       
        if (list.size() < N) return;

        Collections.sort(list);

        for (int i = N - 1; i >= 0; i--) {
            System.out.print(list.get(i));
            if (i > 0) System.out.print(" ");
        }
    }
}
