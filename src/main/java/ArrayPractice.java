import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        // Find size of Array
        System.out.println("Size of Array:");
        System.out.println(a.length);

        // Read single value from Array
        System.out.println("value of a[0]:" + a[0]);
        System.out.println("value of a[1]:" + a[1]);
        System.out.println("value of a[2]:" + a[2]);
        System.out.println("value of a[3]:" + a[3]);
        System.out.println("value of a[4]:" + a[4]);

        // Display Array Data:
        System.out.println("complete Array Elements: " + Arrays.toString(a));

        //Read multiple values from Array- for loop
        System.out.println("Read multiple values from Array using for loop");
        for (int i = 0; i <= 4; i++) {
            System.out.println(a[i]);
        }
        //Read multiple values from Array- for each loop
        System.out.println("Read multiple values from Array using for each loop");
        for (int element : a) {
            System.out.println(element);
        }

        // Store Hetro-genious data to Array using Object
        Object[] heteroData = {15, true, "riyaj", 'a', 7.0};
        System.out.println(Arrays.toString(heteroData));
        //use for each loop:
        for(Object data:heteroData){
            System.out.println(data);
        }


    }

}
