public class SwitchCase {
    public static void main(String[] args){
        int daynum= 4;

        switch(daynum){
            case 1:
            System.out.println("Monday");
            break;

            case 2:
            System.out.println("Tuesday");
            break;

            case 3:
            System.out.println("Wednesday");
            break;

            case 4:
            System.out.println("Thursday");
            break;

            case 5:
            System.out.println("Friday");
            break;

            case 6:
            System.out.println("Saturday");
            break;

            case 7:
            System.out.println("Sunday");
            break;

            default:
            System.out.println("Not a Valid day");
            break;


        }

        switch(daynum){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            System.out.println("weekdays");
            break;
            case 6:
            case 7:
            System.out.println("Weekend");
            break;
            default:
            System.out.println("Nither weekend nor weekdays");
            break;

        }

    }
    
}
