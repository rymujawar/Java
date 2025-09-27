import java.util.Arrays;

public class NumberSwappingLogic {

    public static int[] swaptwoNumbers(int num1, int num2){

        // Print before Swapping
        System.out.println("Before swapping " + num1+" "+num2);
        int temp =num1;
        num1=num2;
        num2=temp;
        return new int[]{num1,num2};
    }

    public static void main(String[] args) {
        int[] Result= swaptwoNumbers(200,500);

        System.out.println("After Swapping"+" "+Arrays.toString(Result));


    }

}
