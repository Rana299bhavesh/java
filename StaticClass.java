
public class StaticClass{
    public static void main(String[] args){
        System.out.println(InnnerClass.staticInnerClass.statInnervar);
        System.out.println(InnnerClass.staticInnerClass.nonstatInnerVar);

    }

}

class InnnerClass{
    public int nonStatvar;
    public static int  statVar;

    static class staticInnerClass{
        int nonstatInnerVar=10;
        static int statInnervar=40;
    }
}





