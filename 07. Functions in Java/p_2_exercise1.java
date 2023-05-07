import java.util.Scanner;

public class p_2_exercise1 {

    // Make a function to add 2 numbers and return the sum
    public static int sum(int a, int b) {
        return a + b;
    }

    // function to multiply 2 numbers and return the product
    public static int product(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // calling the function
        System.out.println("The sum of given numbers: " + sum(num1, num2));
        System.out.println("The product of given numbers: " + product(num1, num2));

        sc.close();

    }
}
