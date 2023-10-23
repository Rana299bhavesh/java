public class ComandLines {
    public static void main(String[] args){
        String firstName = args[0];
        String lastName = args[1];

        System.out.println("Full name: " + firstName + " " + lastName);

        int a = Integer.valueOf(args[2]);
        int b = Integer.valueOf(args[3]);
        int sum = Integer.valueOf(a+b);

        System.out.println("Sum= " + sum);
    }
    
}
