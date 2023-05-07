public class p_2_solid_rhombus {
    public static void main(String[] args) {
        /*
         * Print the Pattern
         * ----******
         * ---***** // -> ---- represents spaces
         * --*****
         * -*****
         * *****
         */

        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            int spaces = rows - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= rows; k++) {
                System.out.print("*");
            }
            // line break
            System.out.println();
        }

    }
}
