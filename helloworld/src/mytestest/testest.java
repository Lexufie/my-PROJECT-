package mytestest;

import java.util.Scanner;

public class testest {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	    
	        System.out.println("Studen A:");
	        int FirstGrade = scanner.nextInt();

	        System.out.println("Student B:");
	        int SecondGrade = scanner.nextInt();

	        System.out.println("Student C:");
	        int ThirdGrade = scanner.nextInt();

	      
	        double average = (FirstGrade + SecondGrade + ThirdGrade) / 3.0;
	        System.out.printf("Average is: %.3f%n", average);
            
	        
	        
	        char gradeIfElse;
	        if (average >= 90 && average <= 100) {
	            gradeIfElse = 'A';
	            System.out.println("Grade is: A");
	        } else if (average >= 80 && average <= 89) {
	            gradeIfElse = 'B';
	            System.out.println("Grade is: B");
	        } else if (average >= 75 && average <= 79) {
	            gradeIfElse = 'C';
	            System.out.println("Grade is: C");
	        } else {
	            gradeIfElse = 'F';
	            System.out.println("grade is  F");
	        }

	       
	        
	        char gradeSwitchCase;
	        switch ((int) average / 10) {
	            case 10:
	            case 9:
	                gradeSwitchCase = 'A';
	                break;
	            case 8:
	                gradeSwitchCase = 'B';
	                break;
	            case 7:
	                gradeSwitchCase = 'C';
	                break;
	            default:
	                gradeSwitchCase = 'F';
	                break;
	                
	             
	        }

	        
	   
	    }
	}