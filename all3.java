
import java.util.Scanner;

public class all3{

    // Question 3: Check Palindrome
    public static boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        return original == reverse;
    }

    // Question 4: Math Class Methods
    public static void mathMethods() {
        System.out.println("Minimum = " + Math.min(10, 20));
        System.out.println("Maximum = " + Math.max(10, 20));
        System.out.println("Square Root = " + Math.sqrt(25));
        System.out.println("Power = " + Math.pow(2, 3));
        System.out.println("Average = " + ((10 + 20) / 2.0));
        System.out.println("Absolute Value = " + Math.abs(-15));
    }

    // Question 5: Sum of Digits
    public static int sumOfDigits(int n) {
        int sum = 0;
        n = Math.abs(n);

        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 3
        System.out.print("Enter a number to check palindrome: ");
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        // Question 4
        System.out.println("\nMath Class Methods:");
        mathMethods();

        // Question 5
        System.out.print("\nEnter a number to find sum of digits: ");
        int num = sc.nextInt();

        System.out.println("Sum of digits = " + sumOfDigits(num));

        sc.close();
    }
}
