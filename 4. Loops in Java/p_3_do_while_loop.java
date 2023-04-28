public class p_3_do_while_loop {
    public static void main(String[] args) {
        // Syntax for "do-while loop"
        /*
         * do{
         * // do something
         * // updation
         * }while(condition);
         */

        // do while loop to print "Hello World!" 10 time. do while run atleast 1 time
        // even if the condition is not true.

        int i = 0;
        do {
            System.out.println("Hello World");
            i++;
        } while (i < 10);
    }

}
