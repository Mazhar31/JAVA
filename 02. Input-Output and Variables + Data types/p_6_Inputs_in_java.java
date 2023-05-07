
// You have to import scanner class to take inputs
import java.util.Scanner;

public class p_6_Inputs_in_java {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        // if you want to take multiple words as input use nextLine()
        System.out.println("Enter your full name: ");
        String fullName = sc.nextLine();
        System.out.println(fullName);
        System.out.println();
        // if you want to take single word as input use next()
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println(name);
        // same goes for integers and other datatypes you can use nextInt() for int,
        // nextFloat() for float and so on.
        sc.close();
    }
}
