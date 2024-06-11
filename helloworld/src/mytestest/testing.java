
package mytestest;

import java.util.Scanner;
public class testing {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Data in Array");
		
		String input = scanner.nextLine();
		String[] dataArray = input.split(" ");
		int n = dataArray.length;
		
		System.out.print("Stored Data in Array:" );
		for (String element : dataArray) {
			System.out.print(element + " ");
			
		}
		System.out.println();
		
		System.out.print("Enter position of Elementh to Delete:");
		int position = scanner.nextInt();
		
		if (position < 1 || position > n) {
			System.out.println("Invalid position. Position should be between 1 and " + n);
        } else {
            
            for (int i = position; i < n - 1; i++) {
                dataArray[i] = dataArray[i + 1];
            }
            n--;

        
            System.out.print("New data in Array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(dataArray[i]);
                if (i < n - 1 ) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}



