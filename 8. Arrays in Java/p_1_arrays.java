import java.util.Scanner;

public class p_1_arrays {
    public static void main(String[] args) {
        /*
         * Syntax for arrays in java (1)
         * 
         * type[] arrayName = new type[size];
         * 
         * Syntax for arrays in java (2)
         * 
         * type[] arrayName = {1, 2, 3, 4, 5};
         * 
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        // initializing array
        int[] number = new int[size];

        // taking array's elements as input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter array element at index (" + i + "): ");
            number[i] = sc.nextInt();
        }

        // output array
        for (int i = 0; i < size; i++) {
            System.out.println("Element at index ( " + i + " ) is: " + number[i]);
        }

        sc.close();
    }
}