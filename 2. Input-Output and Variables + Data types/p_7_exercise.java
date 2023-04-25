import java.util.Scanner;

public class p_7_exercise {
    public static void main(String[] args) {
        // Question: Take 2 variables 'a' & 'b' and print their sum.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
        sc.close();
    }
}
