/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side.
 * This is known as the Triangle Inequality Theorem.
 * Write a program that tests if three given integers form a triangle.
 */
public class Triangle {
    public static void main(String[] args) {

        // Parse the command line arguments
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // Test if a,b,c can form a triangle
        boolean isTriangle = (a + b) > c && (a + c) > b && (b + c) > a;

        // Print the result
        System.out.println(a + ", " + b + ", " + c + ": " + isTriangle);
    }
}
