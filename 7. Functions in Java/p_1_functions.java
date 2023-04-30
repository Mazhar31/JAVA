import java.util.Scanner;

public class p_1_functions {

    // Function to print name with Hello
    public static void printName(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        // calling the function
        printName(name);

        sc.close();
    }
}
