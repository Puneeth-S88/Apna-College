import java.util.*;
public class evenodd{
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        if(isEven(n)){
            System.out.println(n + " is even");
        }else{
            System.out.println(n + " is odd");
        }
    }
}