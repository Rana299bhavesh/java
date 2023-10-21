public class NonArgConstructor {
    int i;
    String s;

    public NonArgConstructor(){
        i=10;
        s="Rana";
        System.out.println(i);
        System.out.println(s);
    }
    public static void main(String[] args){
        NonArgConstructor nac = new NonArgConstructor();
        nac.method();
    }

    public void method(){
        System.out.println("just A method ");
    }
    
}
