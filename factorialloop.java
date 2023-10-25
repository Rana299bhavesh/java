import java.util.*;
public class factorialloop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter teh number: ");
        int number = sc.nextInt();


        
        Factorialloop(5);

        

        

    }

    public static void Factorialloop(int n){
        int a=1;
        
        for(int i=5; i>=1; i--){
            a=a*i;

        }
        System.out.println("Factorial of number is " + a);
        

    }
    
    
}
