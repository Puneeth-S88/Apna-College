public class kadanes {


public static void printSubarrays(int numbers[]) {

    int CS = 0;
    int MS = Integer.MIN_VALUE;

    for (int i = 0; i < numbers.length; i++) {

        CS = CS + numbers[i];

        MS = Math.max(CS, MS);

        if (CS < 0) {
            CS = 0;
        }
    }

    System.out.println("max sum = " + MS);
}

public static void main(String[] args) {
    int numbers[] = {2, 4, 6, 8, 10};
    printSubarrays(numbers);
}


}
