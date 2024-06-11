
public class MathProblem3 {

    public static void main(String[] args) {
        // Define the initial ratios and amount of turkey sold
        int initialTurkeyRatio = 8;
        int initialChickenRatio = 3;
        int turkeySold = 14;

        // Calculate the amount of turkey left in the morning
        int remainingTurkey = (initialTurkeyRatio * turkeySold) / initialChickenRatio;
        
        // Calculate the new ratios
        int newTurkeyRatio = remainingTurkey;
        int newChickenRatio = 2;

        // Calculate the pounds of turkey and chicken in the morning
        int poundsTurkeyInMorning = remainingTurkey * initialTurkeyRatio / newTurkeyRatio;
        int poundsChickenInMorning = poundsTurkeyInMorning * initialChickenRatio / initialTurkeyRatio;

        // Output the results
        System.out.println("Pounds of turkey in the morning: " + poundsTurkeyInMorning);
        System.out.println("Pounds of chicken in the morning: " + poundsChickenInMorning);
    }
}

