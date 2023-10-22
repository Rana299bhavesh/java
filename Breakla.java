public class Breakla {
    public static void main(String[] args){
        for(int i=0; i<5; i++){
            for(int j =1; i<=3; i++){
                if(i==4  || j==2){
                    break;
                }
                System.out.println("i= " + i + "j= " + j);
            }
        }

    }
    
}
