public class OddEvenNumbers {
    public static String checkOddEven(int num) {
        if(num<0){
            throw new IllegalArgumentException("Number cannot be negative!");
        }
        return (num % 2 == 0) ? "Even Number" : "Odd Number";

    }

    public static void main(String[] args) {
        try {
            int userNum = 7;
            String result = checkOddEven(userNum);
            System.out.println(result);
            System.out.println("Given number " + userNum + " is " + result);
        } catch (Exception e) {
            System.out.println("Exception--->"+e.getMessage());
        }


    }
}
