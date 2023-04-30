import java.util.Scanner;

public class p_3_factorial {

    // find factorial
    public static void findFact(int num) {

        if (num < 0) {
            System.out.println("Invalid number!");
            return;
        }

        int factorial = 1;
        if (num == 0) {
            System.out.println("The factorial of the given number is: " + factorial);
            return;
        } else {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
        }
        System.out.println("The factorial of the given number is: " + factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find it's factorial: ");
        int num = sc.nextInt();
        // calling the function
        findFact(num);

        sc.close();
    }
}
