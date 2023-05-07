import java.util.Scanner;

public class p_3_2D_arrays {
    public static void main(String[] args) {
        /*
         * Syntax for 2D-Arrays in java
         * 
         * type[][] arrayName = new type[rows][columns];
         * 
         * int[][] numbers = new int[3][5];
         * 
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns (space separated): ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];

        // take 2d array as input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Insert element in array at (" + i + "," + j + "): ");
                numbers[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            // line break
            System.out.println();
        }

        sc.close();
    }
}
