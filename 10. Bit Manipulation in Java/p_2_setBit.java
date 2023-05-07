public class p_2_setBit {
    public static void main(String[] args) {
        /*
         * Qs: Set the 2nd bit (position = 1) of a number n. (n = 0101)
         * Bit Mask: 1<<i
         * operation: OR
         */

        int n = 5; // 0101
        int pos = 1;
        int bitMask = 1 << pos;

        int newNumber = n | bitMask;
        System.out.println("New number after setting bit at 2nd bit (podition = 1): " + newNumber);
    }
}
