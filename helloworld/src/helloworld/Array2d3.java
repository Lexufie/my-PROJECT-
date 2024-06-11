package helloworld;

public class Array2d3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        int n = 4;  // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces before the first *
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            // Print * or A* depending on the row
            for (int k = 1; k <= i; k++) {
                if (k == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("A*");
                }
            }

            // Move to the next line after each row
            System.out.println();
        }
    }

	}


