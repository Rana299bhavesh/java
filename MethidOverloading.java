//by changing the no of para meters

public class MethidOverloading {
    
    public void add(){
        System.out.println("Adding...");
    
    }

    public void add(int a){
        System.out.println("Adding..." + a);
    }

    public void add(int a, int b){
        System.out.println(a+b);
    }
    
    

    public static void main(String[] args){
        MethidOverloading md = new MethidOverloading();
        md.add();
        md.add(23);
        md.add(56,10);
    }

    

}
