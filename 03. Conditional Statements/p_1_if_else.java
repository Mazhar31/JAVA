import java.util.Scanner;

public class p_1_if_else {
    public static void main(String[] args) {
        // Use to take inputs
        Scanner sc = new Scanner(System.in);
        // taking age as an input
        System.out.print("Enter Your age: ");
        int age = sc.nextInt();

        // Checking with if-else condition whether the given age is of adult or not
        if (age > 18) {
            System.out.println("You are an Adult");
        } else {
            System.out.println("You are not an Adult!");
        }

        // it's a good practice to close scanner object after using it...
        sc.close();
    }
}
