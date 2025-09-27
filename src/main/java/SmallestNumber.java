public class SmallestNumber {
    public static int findSmallestOfThreeNumbers(int a, int b, int c) {
        // invalid check and Exception
        if ((a < 0) || b < 0 || c < 0)
            throw new IllegalArgumentException("Number cannot be Negative!");
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }
    public static void main(String[] args) {
        int num1 = 10, num2 = -5, num3 = 9;
        try {
            int smallestNumber = findSmallestOfThreeNumbers(num1, num2, num3);
            System.out.println("Smallest number is: " + smallestNumber);
        } catch (Exception e) {
//            throw new RuntimeException(e);
            throw new IllegalArgumentException(e);
//            System.out.println("Exception-->"+e.getMessage());
        }
    }
}
