package AbdulPABG;



public class Main {
    public static void main(String[] args) {
        generateExpressions("1", 1, 2, 100);
    }

    public static void generateExpressions(String currentExpr, int currentSum, int num, int targetSum) {
        if (num == 10) {
            if (currentSum == targetSum) {
                System.out.println(currentExpr);
            }
            return;
        }

        // Addition
        generateExpressions(currentExpr + "+" + num, currentSum + num, num + 1, targetSum);

        // Subtraction
        generateExpressions(currentExpr + "-" + num, currentSum - num, num + 1, targetSum);

        // Concatenation (no operation)
        generateExpressions(currentExpr + num, currentSum * 10 + num, num + 1, targetSum);
    }
}
