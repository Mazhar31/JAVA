import java.util.Scanner;

public class p_1_Strings {
    public static void main(String[] args) {
        // String Declaration
        // String name = "Mazhar";
        // String fullName = "Mazhar Shafiq";
        // String sentence = "My name is Muhammad Mazhar Shafiq";

        // take String as input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you name: ");
        String nameInput = sc.nextLine();
        System.out.println("Hello " + nameInput);
        System.out.println("String length is: " + nameInput.length());

        // to print the string character by character
        for (int i = 0; i < nameInput.length(); i++) {
            System.out.println(nameInput.charAt(i));
        }
        sc.close();
    }
}
