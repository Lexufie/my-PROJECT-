package mytestest;

public class asdsa {

	  public static void main(String[] args) {
	        generateExpressions("", 1, 2, 3, 4, 5, 6, 7, 8, 9, 100);
	    }

	    private static void generateExpressions(String expression, int... numbers) {
	        if (numbers.length == 1) {
	            if (numbers[0] == 100) {
	                System.out.println(expression + numbers[0]);
	            }
	            return;
	        }

	        int currentNumber = numbers[0];
	        int[] remainingNumbers = new int[numbers.length - 1];
	        System.arraycopy(numbers, 1, remainingNumbers, 0, remainingNumbers.length);

	        generateExpressions(expression + currentNumber + "+", add(currentNumber, remainingNumbers));
	        generateExpressions(expression + currentNumber + "-", subtract(currentNumber, remainingNumbers));
	        generateExpressions(expression + currentNumber, concatenate(currentNumber, remainingNumbers));
	    }

	    private static int[] add(int operand, int[] numbers) {
	        int[] result = new int[numbers.length];
	        for (int i = 0; i < numbers.length; i++) {
	            result[i] = operand + numbers[i];
	        }
	        return result;
	    }

	    private static int[] subtract(int operand, int[] numbers) {
	        int[] result = new int[numbers.length];
	        for (int i = 0; i < numbers.length; i++) {
	            result[i] = operand - numbers[i];
	        }
	        return result;
	    }

	    private static int[] concatenate(int operand, int[] numbers) {
	        int[] result = new int[numbers.length];
	        for (int i = 0; i < numbers.length; i++) {
	            result[i] = Integer.parseInt(Integer.toString(operand) + Integer.toString(numbers[i]));
	        }
	        return result;
	    }
	}