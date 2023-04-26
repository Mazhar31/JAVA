import java.util.Scanner;

public class p_2_odd_or_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input
        System.out.print("Enter a number to check whether it is even or odd: ");
        int num = sc.nextInt();
        // Checking if the number is even or odd.
        if (num % 2 == 0) {
            System.out.println("The given number is even");
        } else {
            System.out.println("The given number is odd");
        }

        sc.close();
    }
}
