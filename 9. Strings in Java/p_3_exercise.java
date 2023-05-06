import java.util.Scanner;

public class p_3_exercise {
    public static void main(String[] args) {
        // Reverse a String
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string you want to reverse: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        for (int i = sb.length() - 1; i >= 0; i--) {
            System.out.print(sb.charAt(i));
        }
        // line break
        System.out.println();

        // more efficient way as loop will run half time as above loop and also making
        // changes in original Strin
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);

        sc.close();
    }
}
