import java.util.*;

public class RecursionDemo {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();

        int factNum = factorialNum(number);
        System.out.println("Factorial of " + number + " is " + factNum);

        sc.close();

  }

    public static int factorialNum(int num){
        if(num!=0){
           return num * factorialNum(num-1);

        }
        else{
            return 1;
        }
    }
    
}
