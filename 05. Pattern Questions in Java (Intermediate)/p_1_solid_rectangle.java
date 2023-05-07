public class p_1_solid_rectangle {
    public static void main(String[] args) {
        /*
         * Print the Pattern
         * *****
         * *****
         * *****
         * *****
         */

        int rows = 4;
        int cols = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("*");
            }
            // Line break
            System.out.println();
        }

    }
}