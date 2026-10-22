import java.util.Scanner;
public class square1{
    public static int square1(int n){
        return n * n;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println(square1(n));
    }
}