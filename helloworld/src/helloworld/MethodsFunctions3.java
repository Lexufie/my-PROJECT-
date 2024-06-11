package helloworld;

public class MethodsFunctions3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	add(1,8,7);
	
	greet("Lexu",18);

	}

	static void add(int num1, int num2 , int num3) {
		System.out.println(num1 + num2 + num3);
	}
    


	static void greet(String name, int age ) {
	    print("hello, " + name);
	    print("You are Bobo " + age + " Years old.");
	    
	   
	}
	//short methode
	static void print(String word) {
		System.out.println(word);
	}



}



