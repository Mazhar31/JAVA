import java.util.Scanner;

public class p_3_exercise {
    public static void main(String[] args) {
        /*
         * Take 2 inputs from user a and b.
         * if a is greater than b print -> a is greater
         * if a is equal to b print -> a is equal to b
         * if a is less than b print -> a is lesser
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b) {
            System.out.println("a is Lesser.");
        } else if (a > b) {
            System.out.println("a is Greater!");
        } else {
            System.out.println("a is equal to b!");
        }

        sc.close();
    }
}
