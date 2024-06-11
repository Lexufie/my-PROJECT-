package mytestest;
import java.util.Scanner;
public class Testesngwhileloop {

 public static void main(String[] args) {
		        
			 
			 
			 
			    String name;
		        int answer;
		        Scanner scan = new Scanner(System.in);

		        System.out.println("Please insert your name");
		        name = scan.nextLine();
		        System.out.println("Hello, Mr. " + name);

		        System.out.println("Would you like to change your name? Insert 1 for yes and 2 for no");
		        answer = scan.nextInt();

		  
		        while (answer == 1) {
		  
		            scan.nextLine();

		            System.out.println("Please insert your new name");
		            name = scan.nextLine();
		            System.out.println("Hello, Mr. " + name);

		            System.out.println("Would you like to change your name again? Insert 1 for yes and 2 for no");
		            answer = scan.nextInt();
		        }

		        System.out.println("Goodbye!");
		    }
	


}
