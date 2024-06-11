package mytestest;

public class problem3 {

    public static void main(String[] args) {
        int[] findCombinations = {1,2,3,4,5,6,7,8,9,10};
        findCombinations(1, 0, "1");
    }

    public static void findCombinations(int current, int sumSoFar, String expression) {
        if (current == 10) {
            sumSoFar += 10;
            expression += "10";
            if (sumSoFar == 100) {
                System.out.println(expression);
            }
        } else {
            // Adding current number with a plus sign
            findCombinations(current + 1, sumSoFar + current, expression + "+" + current);
            // Adding current number with a minus sign
            findCombinations(current + 1, sumSoFar - current, expression + "-" + current);
            // Combining current number with the previous number
            if (current < 9) {
                int next = current + 1;
                int combinedNumber = Integer.parseInt(current + "" + next);
                findCombinations(next + 1, sumSoFar - current + combinedNumber, expression + "" + next);
                
              
            }
        }
    }
}
