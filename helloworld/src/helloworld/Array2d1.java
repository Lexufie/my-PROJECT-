package helloworld;
import java.util.Scanner;
public class Array2d1 {

	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter Size of Array: ");
        int size = scanner.nextInt();

        // Input array elements
        int[] arr = new int[size];
        System.out.println("Enter any " + size + " elements in Array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Separate even and odd elements
        System.out.print("Even Elements:");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(" " + arr[i]);
            }
        }

        System.out.print("\nOdd Elements:");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(" " + arr[i]);
            }
        }

        scanner.close();
    }
}