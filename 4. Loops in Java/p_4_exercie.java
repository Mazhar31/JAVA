import java.util.Scanner;

public class p_4_exercie {
    public static void main(String[] args) {
        // Qs: Print the Sum of First n Natural Numbers. (Take n as an input)

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number upto which you want the sum: ");
        int n = sc.nextInt();
        int sum = 0;

        // Doing it with for loop
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println("The sum of First " + n + " Natural Numbers (using for loop): " + sum);

        // Resetting the sum = 0 to use it with while loop
        sum = 0;

        // Doing it with while loop
        int i = 0;
        while (i < n) {
            sum += i;
            i++;
        }
        System.out.println("The sum of First " + n + " Natural Numbers (using while loop): " + sum);

        // Resetting the sum = 0 to use it with do-while loop
        sum = 0;

        // Doing it with do-while loop
        int j = 0;

        do {
            sum += j;
            j++;
        } while (j < n);
        System.out.println("The sum of First " + n + " Natural Numbers (using do-while loop): " + sum);

        sc.close();
    }

}
