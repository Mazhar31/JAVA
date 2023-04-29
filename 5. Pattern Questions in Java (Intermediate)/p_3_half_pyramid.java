public class p_3_half_pyramid {
    public static void main(String[] args) {
        /*
         * Print the Pattern
         * *
         * **
         * ***
         * ****
         * *****
         */

        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // lline break
            System.out.println();
        }

    }
}
