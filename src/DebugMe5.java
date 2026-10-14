// GAUNTLET 5 of 5 — ⚠️ THIS ONE COMPILES AND RUNS.
//
// It reports that the student scored 0.0%.
// The student actually got 43 out of 50, which is 86%.
//
// The compiler will not help you here. You have to find this yourself.
//
// Strategy: print the intermediate values. Find the exact line
// where reality stops matching what you expected.
public class DebugMe5 {
    public static void main(String[] args) {
        int pointsEarned = 43;
        int pointsPossible = 50;

        double percentage =  pointsEarned / pointsPossible * 100;

        System.out.println("Score: " + percentage + "%");
    }
}
