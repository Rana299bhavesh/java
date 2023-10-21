public class StaticVariable {

    static String empCompanyName="Oracle";
    public static void main(String[] args){
        
        StaticVariable ed = new StaticVariable();
        ed.empCompanyName = "Google";
        ed.empdetails(101,"Rana Bhavesh");
        ed.empdetails(102,"Rana ");
        


        StaticVariable sd = new StaticVariable();
        sd.empdetails(201,"Aman");
        sd.empdetails(203,"Bhavesh");

        
    }

public void empdetails(int empId, String empName){
    System.out.println(empId);
    System.out.println(empName);

    System.out.println(StaticVariable.empCompanyName);
}

    
}
