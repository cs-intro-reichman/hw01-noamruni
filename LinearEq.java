/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
    public static void main(String[] args) {

        // Parse the command line arguments (we assume a != 0 and all values are doubles)
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        // Calculate x
        double x = ((c - b) / a);

        // Print the result
        System.out.println(a + " * x + " + b + " = " + c);
        System.out.println("x = " + x);
    }
}