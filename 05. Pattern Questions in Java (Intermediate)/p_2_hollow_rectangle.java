public class p_2_hollow_rectangle {
    public static void main(String[] args) {
        /*
         * Print the Pattern
         * *****
         * *---* -> --- represents spaces here.
         * *---*
         * *****
         */

        int rows = 4;
        int cols = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if ((i == 1 || i == rows) || (j == 1 || j == cols)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Line Break
            System.out.println();
        }

    }
}
