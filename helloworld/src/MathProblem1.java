
public class MathProblem1 {

	public static void main(String[] args) {
		
	
	        double usualPrice = 150.0;
	        double discountPercentage = 20.0;
	        
	    
	        double discountAmount = (discountPercentage / 100) * usualPrice;
	        
	      
	        double finalPrice = usualPrice - discountAmount;
	        
	        System.out.println("Discount amount: $" + discountAmount);
	        System.out.println("Final price after discount: $" + finalPrice);
	        
	    }
	}