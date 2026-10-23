import java.util.Scanner;

public class arr {

    // Method to create and populate the array
    public int[] createArray(int size) {
        int[] arr = new int[size];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    
    // Method to display the array and calculate cumulative product
    public void displayArray(int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        System.out.println("Product of elements: " + product);

        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        arr obj = new arr();
        int[] userArray = obj.createArray(size);
        obj.displayArray(userArray);

        sc.close();
    }
}