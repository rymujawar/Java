public class CountDigits {
    public static int countDigits(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed!");
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        try {
            int number = 234;
            int result = countDigits(number);
            System.out.println("total digits in" + " " + number + " = " + result);
        } catch (Exception e) {
            System.out.println("Exception--->" + e.getMessage());
        }
    }
}
