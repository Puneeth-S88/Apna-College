import java.util.*;
public class produ{
    public int multiply(int a, int b){
        return a * b;
    }
    public static void main(String[] args){
        produ obj=new produ();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();
        int result=obj.multiply(num1,num2);
        System.out.println("Product of "+num1+" and "+num2+" is: "+result);
        sc.close();
    }
}