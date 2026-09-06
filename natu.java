import java.util.*;
public class natu{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int i=0;
        int n= sc.nextInt();
        int sum=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}

