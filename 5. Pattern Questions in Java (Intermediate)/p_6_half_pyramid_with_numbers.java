public class p_6_half_pyramid_with_numbers {
    public static void main(String[] args) {
        /*
         * Print the Pattern
         * 1
         * 12
         * 123
         * 1234
         * 12345
         */

        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // line break
            System.out.println();
        }

    }
}