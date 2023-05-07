public class p_3_number_pyramid {
    public static void main(String[] args) {
        /*
         * Print the Pattern
         * 
         * ----1----
         * ---2 2--- // -> --- represents spaces
         * --3 3 3--
         * -4 4 4 4-
         * 5 5 5 5 5
         */

        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            // line break
            System.out.println();
        }
    }
}
