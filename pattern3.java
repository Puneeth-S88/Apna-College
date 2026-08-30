import java.util.*;

class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // for example, n = 5

        for (int i = n; i >= 1; i--) {
            // 1. Decreasing part: from n down to i
            for (int j = n; j >= i; j--) {
                System.out.print(j);
            }
            
            // 2. Increasing part: from i + 1 up to n
            for (int k = i + 1; k <= n; k++) {
                System.out.print(k);
            }
            
            // 3. Move to the next line
            System.out.println();
        }
    }
}