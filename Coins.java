/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
    public static void main(String[] args) {

        // Parse the command line arguments
        int coins = Integer.parseInt(args[0]);

        // Calculate the number of quarters and cents that are needed
        int quarters = coins / 25;
        int cents = coins % 25;

        // Print the result
        System.out.println("Use " + quarters + " quarters and " + cents + " cents");
    }
}