public class WhilePractice {
    public static void main(String[] args){

        //Print 1  to 10 numbers using while
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

        // Print Hello 10 times
        int j=1;
        while(j<=10){
            System.out.println(j+". "+"Hello");
            j++;
        }
        //Print Even numbers between 1 to 10
        System.out.println("Even numbers between 1 to 10:");
        int evenNum =1;
        while(evenNum<=10){
            if(evenNum%2==0){

                System.out.println(evenNum);
            }
            evenNum++;
        }
        //Print Odd numbers between 1 to 10
        System.out.println("Odd numbers between 1 to 10:");
        int oddNum=1;
        while(oddNum<=10){
            if(oddNum%2 !=0){
                System.out.println(oddNum);
            }
            oddNum++;
        }
        // Print 1 to 10 numbers in  Descending Order
        System.out.println("Numbers between 1 to 10 in Descending order:");
        int num=10;
        while(num>0){
            System.out.println(num);
            num --;

        }

    }
}
