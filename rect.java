import java.util.*;
public class rect{
    public static float area(float length,float breadth){
        float area=length*breadth;
        return area;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        float length=sc.nextFloat();
        System.out.print("Enter breadth of rectangle: ");
        float breadth=sc.nextFloat();
        float area=area(length,breadth);
        System.out.println("Area of rectangle: "+area);
        //sc.close();
    }
}





