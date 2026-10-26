public class maxsumprefix {


public static void printSubarrays(int numbers[]) {

    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int ts = 0;

    int prefix[] = new int[numbers.length];

    // Calculate prefix sum
    prefix[0] = numbers[0];

    for (int i = 1; i < numbers.length; i++) {
        prefix[i] = prefix[i - 1] + numbers[i];
    }

    for (int i = 0; i < numbers.length; i++) {

        int start = i;

        for (int j = i; j < numbers.length; j++) {

            int end = j;

            if (start == 0) {
                currSum = prefix[end];
            } else {
                currSum = prefix[end] - prefix[start - 1];
            }

            System.out.println(currSum);

            if (maxSum < currSum) {
                maxSum = currSum;
            }

            ts++;
        }

        System.out.println();
    }

    System.out.println("total subarrays = " + ts);
    System.out.println("max sum = " + maxSum);
}

public static void main(String[] args) {
    int numbers[] = {2, 4, 6, 8, 10};
    printSubarrays(numbers);
}


}
