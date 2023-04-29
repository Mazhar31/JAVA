public class p_5_diamond_pattern {
    public static void main(String[] args) {
        /*
         * Print the Pattern
         * ---*
         * --***
         * -*****
         * *******
         * *******
         * -*****
         * --***
         * ---*
         */

        int rows = 4;

        // loop to print the upper part
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print("*");
            }
            // line break
            System.out.println();
        }

        for (int i = 1; i <= rows; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= rows - i + 1; k++) {
                System.out.print("*");
            }
            for (int l = rows - i; l >= 1; l--) {
                System.out.print("*");
            }
            // line break
            System.out.println();
        }

    }
}
