import java.util.Scanner;
public class square{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Float side;
        System.out.println("enter the side of the square:");
        side=sc.nextFloat();
        Float area=side*side;
        System.out.println("area of the square with side " + side + " is: " + area);
}
}