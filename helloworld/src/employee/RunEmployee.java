package employee;
import java.util.Scanner;

public class RunEmployee {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Employee e = new Employee();
        FullTimeEmployee f = new FullTimeEmployee();
        f.setMonthlySalary(420.69);
        PartTimeEmployee p = new PartTimeEmployee();

        System.out.println("Enter name:");
        String eName = s.nextLine();
        e.setName(eName);

        System.out.println("Press F for Full Time or P for Part Time");
        char EmployeeType = Character.toUpperCase(s.next().charAt(0));

        if (EmployeeType == 'F') {
        	double FullTimeEmployeeSalary = f.getMonthlySalary();
        	String EmployeeName = e.getName();
        	System.out.println("Name: " + EmployeeName);
        	System.out.println("Wage: " + FullTimeEmployeeSalary);
        
        } else if (EmployeeType == 'P') {
        	System.out.println("Enter rate per hour and no. of hours worked separated by space:");
        	double ratePerHour = s.nextDouble();
        	int hoursWorked = s.nextInt();
        	p.setWage(ratePerHour, hoursWorked);
        	
        	String EmployeeName = e.getName();
        	double PartTimeEmployeeSalary = p.getWage();
        	
        	System.out.println("Name : " + EmployeeName);
        	System.out.println("Wage : " + PartTimeEmployeeSalary);
        }else {
        	System.out.println("Invalid input");
        }
    }
}
