public class ParameteizedConstructor {

    public ParameteizedConstructor(int empId, String empName){
        System.out.println(empId);
        System.out.println(empName);
    }
    public static void main(String[] args){
        ParameteizedConstructor pc = new ParameteizedConstructor(101,"Rana");
        ParameteizedConstructor pc1 = new ParameteizedConstructor(102,"Bhavesh");

    }
    
}
