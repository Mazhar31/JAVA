public class p_2_StringBuilder_in_java {
    public static void main(String[] args) {
        // Strings in java are Immutable so we can use StringBuilder
        StringBuilder sb = new StringBuilder("Mazhar");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index
        sb.setCharAt(0, 'A');
        System.out.println(sb);

        // insert char at index
        sb.insert(0, 'M');
        System.out.println(sb);

        // delete char at index
        sb.delete(1, 2);
        System.out.println(sb);

        // append string at last
        sb.append(" Shafiq");
        System.out.println(sb);

        // check the length of String
        System.out.println("The length of the String is: " + sb.length());
    }
}