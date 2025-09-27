public class JumpingStatement {

    public static void printNumbers() {
        for (int i = 1; i <= 20; i++) {
            if (i == 5) {
//                break; // stop the loop when i == 5
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printNumbers();
    }
}
