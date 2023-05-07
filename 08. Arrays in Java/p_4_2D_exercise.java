import java.util.Scanner;

public class p_4_2D_exercise {
    public static void main(String[] args) {
        /*
         * Qs: Take a matrix as input from the user. Search for a given number x and
         * print the indices at which it occurs.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns (space separated): ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // take 2d array as input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter array element at index (" + i + "," + j + "): ");
                numbers[i][j] = sc.nextInt();
            }
        }

        // searching for x
        System.out.print("Enter number you want to find in array: ");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("The given number " + x + " is found at  index (" + i + "," + j + ")");
                }
            }
        }

        sc.close();
    }
}
