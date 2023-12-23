/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
    public static void main(String[] args) {

        // Parse the command line arguments
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // Print the result in a fancy way
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}
