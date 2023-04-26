import java.util.Scanner;

public class p_4_exercise_2 {
    public static void main(String[] args) {
        /*
         * Qs: Print the Greeting.
         * if user enter 1 print -> Hello
         * if user enter 2 print -> Assalam o Alaikum
         * if user enter 3 print -> Welcome!
         */

        // Solution
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("Hello");
        } else if (num == 2) {
            System.out.println("Assalam o Alaikum");
        } else if (num == 3) {
            System.out.println("Welcome");
        } else {
            System.out.println("Enter a Valid number (1, 2, 3)");
        }

        sc.close();
    }
}
