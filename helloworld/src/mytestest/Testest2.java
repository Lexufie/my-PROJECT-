package mytestest;

import java.util.Scanner;

public class Testest2 {

	public static void main(String[] args) {
        final int MAX_CHANCES = 5;
        int pin, enteredPin, chancesLeft = MAX_CHANCES;
        Scanner scan = new Scanner(System.in);

       
        pin = 2002;

        do {
            System.out.println("Enter your ATM PIN: ");
            enteredPin = scan.nextInt();

            if (enteredPin == pin) {
                System.out.println("Congratulations! PIN is correct. You have access to your account.");
                break; 
            } else {
                chancesLeft--;
                System.out.println("Incorrect PIN. Chances left: " + chancesLeft);

                if (chancesLeft == 0) {
                    System.out.println("Sorry, you've run out of chances. Your account is locked.");
                    break; 
                }
            }
        } while (true); 

        System.out.println("Game over. Thank you for playing!");
    }

    }
		
	

