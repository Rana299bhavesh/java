public class wrapperclasses {
    public static void main (String[] args){
        //Primitive to wrapper
        Integer intObject = Integer.valueOf(10);
        System.out.println(intObject);

        Double d= Double.valueOf(20.123);
        System.out.println(d);

         //wrapper to Primitive
         int value = intObject.intValue();
         System.out.println(value);


         //Autoboxing

         Byte b=1;
         Short s=10;
         Integer i= 123;
         Long l= 426L;
         Float f=12.335f;
         Double d1= 12.54673865;
         Character c= 's';
         Boolean bool= true;

         System.out.println(f);

         //Auto-unboxing
         if(i==123){
            System.out.println("Yes this is an Integer");
         }




    }

    
}
