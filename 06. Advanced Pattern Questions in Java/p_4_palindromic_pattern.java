public class p_4_palindromic_pattern {
    public static void main(String[] args) {
        /*
         * Print the Pattern
         * ------- 1
         * ----- 2 1 2
         * --- 3 2 1 2 3
         * - 4 3 2 1 2 3 4
         * 5 4 3 2 1 2 3 4 5
         */

        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l + " ");
            }
            // line break
            System.out.println();
        }
    }
}
