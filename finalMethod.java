public class finalMethod extends parent {
    public void method(){
        System.out.println("This is a methid");
    }
    public static void main(String[] args){
        finalMethod fm = new finalMethod();
        fm.method();

    }
    
}

class parent{
    public void method(){
        System.out.println("This is a parenqt method");
    }
}
