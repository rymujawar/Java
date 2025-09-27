public class CountOddEvenDigitsCustom {

    // 1) A small holder class for the results
    static class DigitStats {
        private final int evenCount;
        private final int oddCount;
        private final int evenSum;
        private final int oddSum;

        public DigitStats(int evenCount, int oddCount, int evenSum, int oddSum) {
            this.evenCount = evenCount;
            this.oddCount = oddCount;
            this.evenSum = evenSum;
            this.oddSum = oddSum;
        }

        public int getEvenCount() {
            return evenCount;
        }

        public int getOddCount() {
            return oddCount;
        }

        public int getEvenSum() {
            return evenSum;
        }

        public int getOddSum() {
            return oddSum;
        }

        // Nice printable format (so no Arrays.toString needed)
        @Override
        public String toString() {
            return "DigitStats{evenCount=" + evenCount +
                    ", oddCount=" + oddCount +
                    ", evenSum=" + evenSum +
                    ", oddSum=" + oddSum + "}";
        }
    }

    // 2) Method that computes the stats and RETURNS the DigitStats object
    public static DigitStats countOddEvenDigits(int num) {
        if (num < 0) throw new IllegalArgumentException("Negative numbers not allowed!");

        // Special case: 0 is one even digit, sums are 0
        if (num == 0) return new DigitStats(1, 0, 0, 0);

        int evenCount = 0, oddCount = 0, evenSum = 0, oddSum = 0;

        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                evenCount++;
                evenSum += digit;
            } else {
                oddCount++;
                oddSum += digit;
            }
            num /= 10;
        }
        return new DigitStats(evenCount, oddCount, evenSum, oddSum);
    }

    // 3) Use it
    public static void main(String[] args) {
        try {
            int number = 12345678;
            DigitStats stats = countOddEvenDigits(number);

            // Print whole object
            System.out.println(stats);

            // Or print individual fields
            System.out.println("Even Count = " + stats.getEvenCount());
            System.out.println("Odd  Count = " + stats.getOddCount());
            System.out.println("Even Sum   = " + stats.getEvenSum());
            System.out.println("Odd  Sum   = " + stats.getOddSum());
        } catch (Exception e) {
            System.out.println("Exception ---> " + e.getMessage());
        }
    }
}
