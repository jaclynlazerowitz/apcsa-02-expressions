/**
 * Exercise 1 — ChangeMaker
 *
 * Given a total in CENTS, output the fewest coins that make it up.
 *
 * Example: 287 cents
 *   Quarters: 11
 *   Dimes:    1
 *   Nickels:  0
 *   Pennies:  2
 *
 * Use only / and %. No conditionals — you don't have them yet.
 *
 * Strategy for each coin:
 *   count     = remaining / coinValue
 *   remaining = remaining % coinValue
 */
public class ChangeMaker {
    public static void main(String[] args) {
        int totalCents = 287;   // try other values when it works

        int quarters = totalCents/25;
        int remainder = totalCents%25;

        int dimes = remainder/10;
        remainder = remainder%10;

        int nickles = remainder/5;
        remainder = remainder%5;

        int pennies = remainder/1;
      //  remainder = remainder%1; can't use it becase anything %1 always equals 0


        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickeles: " + nickles);
        System.out.println("Pennies: " + pennies);

    }
}
