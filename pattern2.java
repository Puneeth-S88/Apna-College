import java.util.Scanner;

public class pattern2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // 1. Increasing pattern (1 to i)
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // 2. Decreasing pattern (i-1 down to 1)
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }

            // 3. Move to the next line
            System.out.println();
        }
    }
}