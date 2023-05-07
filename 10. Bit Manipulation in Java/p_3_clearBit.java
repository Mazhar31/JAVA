public class p_3_clearBit {
    public static void main(String[] args) {
        /*
         * Qs: Clear the 3rd bit (position = 2) of a number n. (n = 0101)
         * Bit Mask: 1<<i
         * operation: AND with NOT(BM)
         */

        int n = 5; // 0101
        int pos = 2;
        int bitMask =1 << pos;

        int notBitMask = ~(bitMask);
        int newNumber = notBitMask & n;
        System.out.println("New number after clearnig bit at postion = 2: " + newNumber);
    }
}
