package mytestest;

import java.util.Scanner;

public class cxvcxvx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);
        String response;

        
            System.out.print("Student A: ");
            double A = scan.nextDouble();
            System.out.print("Student B: ");
            double B = scan.nextDouble();
            System.out.print("Student C: ");
            double C = scan.nextDouble();

            
            double average = (A + B + C ) / 3;
            System.out.printf("Average is: %.3f%n", average - 0.001);
            
            
            
            if (average >= 90 && average <= 100) {
                System.out.println("Grade is: A");
            } else if (average >= 80 && average <= 89) {
                System.out.println("Grade is: B");
            } else if (average >= 75 && average <= 79) {
                System.out.println("Grade is: C");
            } else if (average < 74) {
                System.out.println("Grade is: F");
            } else {
                System.out.println("Invalid average calculated.");
            }
            
    
     }
        
	}
		
	

