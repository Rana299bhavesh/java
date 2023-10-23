public class MethodWithReturnType {
    public static void main(String[] args){
        MethodWithReturnType mwrt=new MethodWithReturnType();

        int emp1Sal = mwrt.employeeSalary(1333,3233,748);
        int emp2Sal = mwrt.employeeSalary(6536,783,8622);

        int totalAmountPaid = emp1Sal+emp2Sal;
        System.out.println("Total amount as Salaries " +totalAmountPaid );
    }

    public int employeeSalary (int basicSalary, int hra, int bonus){
        int netSalary= basicSalary+ hra+ bonus;
        System.out.println("Total Salary: " + netSalary);
        return netSalary;


    }
    
    
}
