public class LargestNumber {
    public static int findLargestOfThreeNumbers(int a, int b, int c) {
        //check for invalid number
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Number should not be Negative");
        }
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
    public static void main(String[] args) {
        //negative number with invalid input
        int num1 = 158, num2 = 42, num3 = 276;
        try {
            int largestNumber = findLargestOfThreeNumbers(num1, num2, num3);
            System.out.println("Largest number is:" + largestNumber);
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println("Exception-->" + e.getMessage());
        }
    }
}
