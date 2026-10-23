import java.util.Scanner;
public class degtofah{
    public static float degToFah(float deg){
        float fah=(deg * 9/5) + 32;
        return fah;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temperature in degree Celsius: ");
        float deg=sc.nextFloat();
        float fah=degToFah(deg);
        System.out.println("Temperature in Fahrenheit: "+fah);
        sc.close();
    }
}