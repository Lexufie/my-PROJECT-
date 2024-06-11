package helloworld;
import java.util.Scanner;
public class Array2d2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data into the array
        System.out.print("Enter Data in Array (space-separated): ");
        String input = scanner.nextLine();
        String[] dataArray = input.split(" ");
        int n = dataArray.length;

        // Display the stored data in the array
        System.out.print("Stored Data in Array: ");
        for (String element : dataArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Input position of the element to delete
        System.out.print("Enter position of Element to Delete: ");
        int position = scanner.nextInt();

        // Validate the position
        if (position < 1 || position > n) {
            System.out.println("Invalid position. Position should be between 1 and " + n);
        } else {
            // Delete the element at the specified position
            for (int i = position - 1; i < n - 1; i++) {
                dataArray[i] = dataArray[i + 1];
            }
            n--;

            // Display the new data in the array
            System.out.print("New data in Array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(dataArray[i]);
                if (i < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
	

