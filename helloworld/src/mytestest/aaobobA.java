package mytestest;

import java.util.Scanner;

public class aaobobA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner s = new Scanner(System.in);
		
		int lives = 3;
		String answer;
		
		while(lives > 0) {
			
			System.out.println("What is your favorite fruit");
			System.out.println("answer : ");
			answer = s.nextLine();
			
			if(answer.equalsIgnoreCase("GOMAGOMA")) break;
			else lives--;
		}
		
		if(lives > 0) System.out.println("You WONWON");
		else System.out.println("You lostlost");
	}

}
