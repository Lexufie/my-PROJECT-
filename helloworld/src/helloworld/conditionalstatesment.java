package helloworld;

import java.util.Scanner;
public class conditionalstatesment {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter age : ");
	    int age = s.nextInt();
	
		//CONDTIONAL STATEMENTS
		
		if( age >= 18) {
			System.out.println("You have Access");
			
		}else {
			System.out.println("Access Denied");
		}

		
		System.out.print("Enter 2nd age : ");
		int age2 = s.nextInt();
		
		//IF ELSE IF ELSE
		if(age2 >= 100) {
			System.out.println("Mataas edad ko");
		}else if(age2 >= 50)  {
			System.out.println("sakto lng edad ko");
		}else if(age >= 30) {
			System.out.println("bata kapa");
		}else { //CODE BLOCK
			System.out.println("ikaw ay minor");
		} //CODE BLOCK CLOSE
		
		
		//NESTED CONDITIONAL STATEMENTS
		System.out.println("Enter 3rd age :");
		int age3 = s.nextInt();
		boolean isVerified = false;
		
		if(age >= 18) {
			System.out.println("pwede ka boi");
			
			if(isVerified) System.out.println("Qualified kang gago ka");
			
			else System.out.println("NOt Qualified kang gago ka");
	}else System.out.println("di ka pwede boi");
				
		
			
		//Equals Function
         //EqualsIGNORECASE
		Scanner x = new Scanner(System.in);
		System.out.print("Enter Greetings : ");
		String greet = x.nextLine();
	
		if (greet.equalsIgnoreCase("Hello")) {
			System.out.println("Hi");
			
			//Equals
			Scanner Scanss = new Scanner(System.in);
			System.out.print("Enter Greetings : ");
			String greet2 = Scanss.nextLine();
			
			if (greet.equals("Hello")) {
				System.out.println("Hi");
			}
			
		}
			
		
		//logical Operators
		//AND && TRUE CONDTION && CONDTITION
		//OR ||  CONDITION || CONDITION
		//NOT !
		Scanner sac = new Scanner(System.in);
		boolean RUler = sac.nextBoolean();
		
		
		boolean hasRuler = true;
	    boolean hasBallpen = true;
	    if(hasRuler && hasBallpen) System.out.print("You can Come in");
	    else System.out.println("You Can Come HOme");
		
	    boolean hasRuler1 = true;
	    boolean hasBallpen1 = false;	
	    if(hasRuler && hasBallpen) System.out.print("You can Come in");
	    else System.out.println("You Can Come HOme");	
			
	    boolean hasRuler2 = false;
	    boolean hasBallpen2 = false;	
	    if(hasRuler && hasBallpen) System.out.print("You can Come in");
	    else System.out.println("You Can Come HOme");	
		
	    boolean hasRuler3 = false;
	    boolean hasBallpen3 = false;	
	    if(hasRuler || hasBallpen) System.out.print("You can Come in");
	    else System.out.println("You Can Come HOme");	
		
	    boolean hasRuler4 = true;
	    boolean hasBallpen4 = false;	
	    if(hasRuler || hasBallpen) System.out.print("You can Come in");
	    else System.out.println("You Can Come HOme");	
	    
	    boolean hasRuler5 = false;
	    boolean hasBallpen5 = false;	
	    if(!hasBallpen5) System.out.print("You can Come in");
	    else System.out.println("You Can Come HOme");	
	    
	    int age7 = 18;
	    boolean isVerified33 = true;
	    
	    if(age7 >= 18 && isVerified)
	    	System.out.println("You ave access and is Qualified");
	    else if(age >= 19 && !isVerified)
	    	System.out.println("You ave access but not Qualified");
	    else	
	    System.out.println("Access Dened");
	    
	    
	}

}


























