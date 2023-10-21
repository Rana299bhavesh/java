public class Typecasting {
    public static void main( String[] args){
        //Automatic Type conversion 
        int i = 10;
        double d = i; // int --> double
        float f = i; // int --> float
        long l = i; // int --> long

        float f1= 123.4f;
        double d1 = f1;

        System.out.println(d);
        System.out.println(f);
        System.out.println(l);
        System.out.println(d1);

        //Explicit conversion 

        int i1= (int) 1.234; //double--> int
        int i2=(int) 10L; // long -->int
        int i3= (int)  1.23f;//float-->int
        float f2 = (float) 1.2345; // double--> float
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(f2);



        
    }
    
}
