import java.util.Random;

/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
    public static void main(String[] args) {

        // Parse the command line arguments
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // Generate 3 numbers within that range
        Random random = new Random();

        // Define range and base
        int range = Math.abs(b - a);
        int c = Math.min(a, b);

        // Generate the numbers
        int x = random.nextInt(range) + c;
        int y = random.nextInt(range) + c;
        int z = random.nextInt(range) + c;

        // Find the minimal number generated
        int min = Math.min(x, y);
        min = Math.min(min, z);

        // Print the result
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println("The minimal generated number was " + min);
    }
}

