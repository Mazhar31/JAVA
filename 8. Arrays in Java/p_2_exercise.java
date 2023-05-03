import java.util.Scanner;

public class p_2_exercise {
    public static void main(String[] args) {
        /*
         * Qs: Take an array as input from the user. Search for a given number x and
         * print the index at which it occurs.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer value: ");
            numbers[i] = sc.nextInt();
        }
        // taking number input to search in array
        System.out.print("Enter a number you want to find in the array: ");
        int x = sc.nextInt();

        // finding x in array
        for (int i = 0; i < size; i++) {
            if (numbers[i] == x) {
                System.out.println("The given number " + x + " is found at " + i + " index");
            }
        }

        sc.close();
    }
}
