public class ReverseNumber {
    public static int reverseNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be Negative!");
        }
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        return reverse;
    }

    public static boolean isPalindrome(int number) {
//        if (number < 0) return false;
        return number == reverseNumber(number);

    }

    public static void main(String[] args) {
        try {
            int num = 165614;
            int result = reverseNumber(num);
            System.out.println("Reverse of number :" + num + " = " + result);
            if (isPalindrome(num)) {
                System.out.println("Both number and reversed numbers are same hence Palindrome");
            } else {
                System.out.println("Not Palindrome number");
            }
        } catch (Exception e) {
            System.out.println("Exception--->" + e.getMessage());
        }

    }
}
