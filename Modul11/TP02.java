import java.util.*;

public class TP02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        ArrayList<Integer> points = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            int poin = scanner.nextInt();
            points.add(poin);
        }
        
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (points.get(j) < points.get(j + 1)) {
                    int temp = points.get(j);
                    points.set(j, points.get(j + 1));
                    points.set(j + 1, temp);
                }
            }
        }
        
        for (int i = 0; i < N; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(points.get(i));
        }
        System.out.println();
        
        scanner.close();
    }
}
