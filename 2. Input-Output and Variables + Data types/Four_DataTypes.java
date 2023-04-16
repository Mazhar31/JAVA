public class Four_DataTypes {
    public static void main(String[] args) {
        // text written before variables are calles DataTypes like (String, int, double,
        // float etc..)
        String name = "Mazhar Shafiq";
        int age = 23;
        int a = 25;
        int b = 10;

        /*
         * Java is a typed language. It means you have to tell the compiler the type of
         * the variable you defined.
         * Data types in java:
         * 1 -> Primitive -> (byte, short, char, boolean, int, long, float, double)
         * 2 -> Non-Primitive -> (String, Array, Class, Object, interface)
         */

        // We can change variables values
        name = "Muhammad Mazhar Shafiq";
        a = 30;
        System.out.println(name);
        System.out.println(a + " " + b);

        int sum = a + b;
        int mul = a * b;
        System.out.println("The sum of a and b is: " + sum);
        System.out.println("The multiplication of a and b is: " + mul);
    }
}
