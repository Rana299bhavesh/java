public class StaticMethod {
    int num =10;
    static int statNum = 20;


    public static void main(String[] args){
        StaticMethod stm = new StaticMethod();
        stm.sum();
        statSum();        
    }



    public void sum(){
        System.out.println(num+num);
        System.out.println(statNum + statNum);
    }


    public static void statSum(){
       // System.out.println(num+num);
        System.out.println(statNum + statNum);

    }
    
}
