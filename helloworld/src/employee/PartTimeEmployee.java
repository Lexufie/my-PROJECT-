package employee;

public class PartTimeEmployee {

	private double ratePerHour, wage;
	private int hoursWorked;
	
	void setWage(double ratePerHour, int hoursWorked) {
		this.ratePerHour = ratePerHour;
		this.hoursWorked = hoursWorked;
		this.wage = ratePerHour * hoursWorked;
		
	}
	
	double getWage() {
		return wage;
	}
}
