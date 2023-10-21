public class logicalOperators {
    public static void main(String[] args){
        boolean b1 =true && true;
        boolean b2 =true && true && true;
        boolean b3 =true && false;
        boolean b4 =true || true;
        boolean b5 =true || false;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);

        System.out.println((10>20) && (20>67));
        System.out.println((23<78) &&(78>54));
    }
    
}
