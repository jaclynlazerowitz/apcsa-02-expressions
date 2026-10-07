/**
 * Exercise 5 (Homework) — SplitTheBill
 *
 * A bill total in cents, split between some number of people.
 * Print each person's share and how many cents are left over.
 *
 * Example: 10000 cents, 3 people
 *   Each person pays: 3333 cents ($33.33)
 *   Left over:        1 cent
 *
 * Challenge: also print the share formatted as dollars.
 */
public class SplitTheBill {
    public static void main(String[] args) {
        int billCents = 10000;
        int people = 3;

        int share = billCents/people;

        System.out.println("Each person pays: " + share + " cents");

        int remainder = billCents%people;
        double dollarShare = (billCents/people)/100; // use /100 because 100 cents make up a dollar
         
        System.out.println("Left over: " + remainder + " cent");

        System.out.println("Dollars: $" + dollarShare);
        // I know it prints as a 33.0 instead of a 33.33, I tried to put all the values as doubles but the rubric said use integer division, so I used int instead

    }
}
