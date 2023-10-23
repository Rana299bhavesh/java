public class StaticBlock {
    static {
        System.out.println("This is static method1");
    }

    

    public static void main(String[] args){
        System.out.println("This is main method");

    }

    static{
        System.out.println("This is Static method 2");
    }

    //Static Block execute before the Main method 
}
