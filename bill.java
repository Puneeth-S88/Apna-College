import java.util.Scanner;
public class bill{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the cost of pen:");
        float cost1=sc.nextFloat();
        System.out.println("Enter the cost of pencil:");
        float cost2=sc.nextFloat();
        System.out.println("Enter the cost of eraser:");
        float cost3=sc.nextFloat();
        float total=cost1+cost2+cost3;
        System.out.println("The total cost is: "+total);
        float cost_with_gst=total+(total*0.76f);
        System.out.println("The total cost with gst of 76%  is: "+cost_with_gst);

    }
}