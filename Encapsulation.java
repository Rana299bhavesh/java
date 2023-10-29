public class Encapsulation {
    public static void main(String [] args){
        Employee e = new Employee();
        //e.employeeId=100;
        //System.out.println(e.employeeId);
        e.setEmployeeId(66);
        System.out.println(e.getEmployeeId());





    }
    

}

class Employee{
    private int employeeId;

    public void setEmployeeId(int employeeId){
        if(employeeId>=0){
            this.employeeId = employeeId;
        }


    }

    public int getEmployeeId(){
        return employeeId;

    }


}
