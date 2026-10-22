
import java.util.Scanner;

public class M {

    public static void avgof3(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        System.out.println(avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        avgof3(3, 4, 5);
    }
}


   