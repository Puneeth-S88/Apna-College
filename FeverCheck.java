import java.util.Scanner;

public class FeverCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your temperature:");
        float temperature = sc.nextFloat();

        if (temperature > 100) {
            System.out.println("You have a fever");
        } else {
            System.out.println("You don't have a fever");
        }
    }
}