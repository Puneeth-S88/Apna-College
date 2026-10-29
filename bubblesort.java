import java.util.Arrays;

public class bubblesort {


public void Bubblesort(int arr[]) {

    for (int i = 0; i < arr.length - 1; i++) {

        for (int j = 0; j < arr.length - i - 1; j++) {

            if (arr[j] > arr[j + 1]) {

                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

            }
        }
    }
}

public static void main(String[] args) {

    int arr[] = {64, 34, 25, 12, 22, 11, 90};

    bubblesort sorter = new bubblesort();

    sorter.Bubblesort(arr);

    System.out.println("Sorted array: " + Arrays.toString(arr));
}


}
