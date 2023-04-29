public class p_5_inverted_half_pyramid_rotated_180 {
    public static void main(String[] args) {
        /*
         * Print the Pattern
         * ----*
         * ---** // -> ---- represents spaces
         * --***
         * -*****
         * ******
         */

        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // loop to print the spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // loop to print the *
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // line break
            System.out.println();
        }

    }
}
