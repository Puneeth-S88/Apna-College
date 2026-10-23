
import java.util.*;

class CalculateSimpleInterest {

    public float calculateSimpleInterest(int p, int t, float r) {
        float SI = (p * t * r) / 100;
        return SI;
    }
}

public class Main1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        int p = sc.nextInt();

        System.out.print("Enter time in years: ");
        int t = sc.nextInt();

        System.out.print("Enter rate of interest: ");
        float r = sc.nextFloat();

        CalculateSimpleInterest obj = new CalculateSimpleInterest();

        float SI = obj.calculateSimpleInterest(p, t, r);

        System.out.println("Simple Interest is: " + SI);

        sc.close();
    }
}


