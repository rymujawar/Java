public class ForPractice {

    public static void main(String[] args) {

        //Print 1  to 10 numbers using for
        System.out.println("Print 1 to 10 numbers using for");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        // Print Hello 10 times
        System.out.println("Print Hello 10 times using for loop");
        for (int j = 1; j <= 10; j++)
            System.out.println(j + ". " + "Hello");


        //Print Even numbers between 1 to 10
        System.out.println("Even numbers between 1 to 10 using for loop");
        for (int evenNum = 1; evenNum <= 10; evenNum++) {
            if (evenNum % 2 == 0) {
                System.out.println(evenNum);
            }
        }
        //Print Odd numbers between 1 to 10
        System.out.println("Odd numbers between 1 to 10 using for");
        for (int oddNum = 1; oddNum <= 10; oddNum++) {
            if (oddNum % 2 != 0) {
                System.out.println(oddNum);
            }
        }
        // Print 1 to 10 numbers in  Descending Order
        System.out.println("Numbers between 1 to 10 in Descending order using for loop");
        for (int num = 10; num > 0; num--) {
            System.out.println(num);

        }

    }
}


