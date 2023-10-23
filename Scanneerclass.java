import java.util.*;

public class Scanneerclass {
    public static void main(String[] args){
        

        Scanner sc = new Scanner(System.in);

        System.out.println("EmployeeId: ");
        int EmployeeId = sc.nextInt();

        System.out.println("Enter Employee Name: ");
        String EmployeeName = sc.next();

        System.out.println("Enter Emplyoee Salary: ");
        String EmpSalary = sc.next();

        System.out.println("These are the employee Details:- ");

        System.out.println("EmployeeId:- " + EmployeeId);
        System.out.println("EmployeeName:- " + EmployeeName);

        System.out.println("EmployeeSalary:- " + EmpSalary);
        



        
        


    }
    
}
