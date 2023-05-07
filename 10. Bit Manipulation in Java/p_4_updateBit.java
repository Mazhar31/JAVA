public class p_4_updateBit {
    public static void main(String[] args) {
        /*
         * Qs: Update the 2nd bit (position = 1) of a number n to 1. (n = 0101)
         * For 0 -------------------------------- For 1
         * Bit Mask: 1<<i ----------------------- Bit Mask: 1<<i
         * operation: AND with NOT -------------- Operation: OR
         */

        int n = 5; // 0101
        int pos = 1;
        int bitMask = 1 << pos;

        int newNumber = bitMask | n;
        System.out.println("New number after updating the bit at position = 1: " + newNumber);
    }
}
