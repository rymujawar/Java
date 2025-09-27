import java.util.Arrays;

public class CountOddEvenDigits {

    public static int[] countOddEvenDigits(int num) {
        int evenCount = 0, oddCount = 0;
        int evenSum = 0, oddSum = 0;

        if (num < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed!");
        }

        if (num == 0) {
            return new int[]{1, 0, 0, 0}; // evenCount=1, oddCount=0, sums=0
        }

        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                evenCount++;
                evenSum += digit;
            } else {
                oddCount++;
                oddSum += digit;
            }
            num = num / 10;
        }

        return new int[]{evenCount, oddCount, evenSum, oddSum};
    }

    public static void main(String[] args) {
        int[] result = countOddEvenDigits(12345678);

        // Print the entire result array
        System.out.println(Arrays.toString(result));
        // Output: [4, 4, 20, 16]

        // Print individual values normally
        System.out.println("Even count = " + result[0]);
        System.out.println("Odd count  = " + result[1]);
        System.out.println("Even sum   = " + result[2]);
        System.out.println("Odd sum    = " + result[3]);
    }
}
