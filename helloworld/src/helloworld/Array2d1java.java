package helloworld;

public class Array2d1java {

    public static void main(String[] args) {

        double BasicSalary = 12000;
        double DAPerecentage = 0.12;
        double HRA = 150;
        double TA = 120;
        double Others = 450;
        double PFPercentage = 0.14;
        double ITPercentage = 0.15;

        double da = BasicSalary * DAPerecentage;
        double pf = BasicSalary * PFPercentage; 
        double it = BasicSalary * ITPercentage;

        double NETSalary = BasicSalary + da + HRA + TA + Others - (pf + it);

        System.out.println("Basic Salary: $" + BasicSalary);
        System.out.println("DA: $" + da);
        System.out.println("HRA $" + HRA);
        System.out.println("TA: $" + TA);
        System.out.println("Others $" + Others);
        System.out.println("PF: $" + pf);
        System.out.println("IT: $" + it);
        System.out.println("Net Salary: $" + NETSalary);


      }


  }
