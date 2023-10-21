public class InstanceVariables {
    int a=4;
    int b=3;
    int c=20;
    public static void main(String[] args){
        InstanceVariables iv= new InstanceVariables();
        iv.instanceVariableMethod();
    }

    public void instanceVariableMethod(){
        System.out.println(a+b);

    }

    public InstanceVariables(){
        a=40;
        System.out.println(a*b);

    }

}
