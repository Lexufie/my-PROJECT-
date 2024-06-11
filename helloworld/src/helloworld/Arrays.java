package helloworld;

import java.util.Scanner;
public class Arrays {
	
    public static void main(String[] args) {


       String[] names = {"ZAFI0", "ZAFFI1", "ZAFI2" , "ZAFI3" , "ZAFI4  "};
       System.out.println(names[0]);
       names[0] = "ZAFINOSLEEP";
       System.out.println(names[0]);
       int numbers[] = {1,2,3,4,5,6,7,8,9,10};
       
       System.out.println(numbers[2] + numbers[5]);
       Scanner s = new Scanner(System.in);
      String employeenames[] = new String[20];
       int kafuk[] = new int[10];
       
      System.out.println("Enter Employee Name : ");
      employeenames[0] = s.nextLine();
      System.out.println(employeenames[0]);
                                
      String email[] = {"zafidaone@yahoo.com" , "zafiinumba1@ygmail.com" , "ZafiSKRTSKRT@hotmail.com"};
      String usernames[] = {"zafimapagmahal123" , "zafineversleeps02" , "zafiDAMONKEY"};
      String passwords[] = {"zafiXD02" , "zafineverdie" , "zafidruguser" };
      
      int i = 2;
      
      System.out.println("INDEX    : " + i );
      System.out.println("Email    : " + email[i]);
      System.out.println("Username : " + usernames[i]);
      System.out.println("Password : " + passwords[i]);
      
      
       
    }
    
    }

