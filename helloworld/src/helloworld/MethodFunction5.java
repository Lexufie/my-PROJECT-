package helloworld;

public class MethodFunction5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(isLegalAge(18));
		
	}
		
	static boolean isLegalAge(int age) {
		if(age >= 18) return true;
		else return false;
	}

}
