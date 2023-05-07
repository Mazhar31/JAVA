import java.util.Scanner;

public class p_5_switch {
    public static void main(String[] args) {
        // Doing same exercise question with switch statement.

        /*
         * Qs: Print the Greeting.
         * if user enter 1 print -> Hello
         * if user enter 2 print -> Assalam o Alaikum
         * if user enter 3 print -> Welcome!
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Assalam o Alaikum");
                break;
            case 3:
                System.out.println("Welcome!");
                break;
            default:
                System.out.println("Please enter a valid number (1, 2, 3)");
        }

        sc.close();
    }
}
