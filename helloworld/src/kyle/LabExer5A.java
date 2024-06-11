package kyle;
import java.util.Random;
import java.util.Scanner;

public class LabExer5A {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
	
	while(true) {
		
		int tries = 0;
		int randomNum = r.nextInt(50) + 1;

		System.out.println("Guess a number from 1 to 50");
		
	while(true) {
	
			if (!s.hasNextInt()) {
			System.out.println("Invalid input.");
			System.out.println("Guess a number from 1 to 50");
			s.next();
			continue;
		}
		
			int guess = s.nextInt();
			tries++;
			
			if (guess > 50) {
				System.out.println("Out of range.");
				break;
			}else if (guess == randomNum) {
				System.out.println("Nice");
				System.out.println("You got it in " + tries + " attempt(s).");
				break;
			}else if (guess < randomNum){
				System.out.println("Too low. Try again");
			}else if (guess > randomNum){
				System.out.println("Too high. Try again");
				}
			}
		}
	}
}
