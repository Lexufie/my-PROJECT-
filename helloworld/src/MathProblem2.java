
public class MathProblem2 {

	public static void main(String[] args) {
		
        // Given data
        double totalSavings = 120;
        double joanneSavings = 4 * totalSavings / 5; 
        double pamSavings = totalSavings / 5; 

        // Calculate ratios and fractions
        double joanneToPamRatio = joanneSavings / pamSavings;
        double joanneFractionOfTotal = joanneSavings / totalSavings;
        double pamFractionOfTotal = pamSavings / totalSavings;
        // Output the results
        System.out.println("a) Ratio of Joanne's savings to Pam's savings to their total savings: " + joanneToPamRatio + ":1:" + (joanneToPamRatio + 1));
        System.out.println("b) Fraction of their total savings that is Joanne's savings: " + joanneFractionOfTotal);
        System.out.println("c) Fraction of Joanne's savings that is Pam's savings: " + (pamSavings / joanneSavings));
        System.out.println("d) Joanne's savings: $" + joanneSavings);
    }
}


