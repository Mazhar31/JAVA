public class p_1_butterfly_pattern {
    public static void main(String[] args) {
        /*
         * Print the Pattern
         * *------*
         * **----**
         * ***--***
         * ******** // -> ---- represents spaces
         * ********
         * ***--***
         * **----**
         * *------*
         */

        int rows = 4;

        // loop to print the upper part
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (rows - i);
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            // line break
            System.out.println();
        }

        // loop to print lower part
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (rows - i);
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            // line break
            System.out.println();
        }

    }
}
