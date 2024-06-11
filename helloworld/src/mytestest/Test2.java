package mytestest;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String[] names = {"david","gewee","gwedlo","gello","Safia"};
		
		System.out.println("name to search : ");
		String search = s.nextLine();
		int i = 0;
		
		while(i < names.length) {
			
			if(names[i].equalsIgnoreCase(search)) {
				System.out.println("We found " +  names[i]);
				break;
				
			}else { 
					System.out.println(names[i]);
				
				}
			i++;
			}
			
			
			
		

	}

	
	
	
	
}
