import java.util.Scanner;
public class prime{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int div=2;
        while(div<num){
            if(num%div==0){
                System.out.println("Not a prime number");
                return;
            }
            div++;
        }
        System.out.println("Prime number");

    }
}