public class p_7_inverted_half_pyramid_with_numbers {
    public static void main(String[] args) {
        /*
         * Print the Pattern
         * 12345
         * 1234
         * 123
         * 12
         * 1
         */

        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // line break
            System.out.println();
        }
    }
}
