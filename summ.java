import java.util.*;
public class summ {
    public static int calculatesum(int a, int b){
        
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = calculatesum(a, b);
        System.out.println("Sum: " + sum);
    }
    
}
