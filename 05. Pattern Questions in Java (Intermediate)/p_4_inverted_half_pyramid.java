public class p_4_inverted_half_pyramid {
    public static void main(String[] args) {
        /*
         * Print the Pattern
         * *****
         * ****
         * ***
         * **
         * *
         */

        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // line break
            System.out.println();
        }

    }
}
