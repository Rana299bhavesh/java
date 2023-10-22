public class labeledContinue {
    public static void main(String[] args){
        firstforloop: for(int i=1; i<6; i++){
            secondforLoop: for(int j=1; j<5; j++){

                if(i==2  || j==3){
                    continue firstforloop;

                }
                System.out.println("i= " + i + "j=" + j);


                
            }
        }
    }
    
}
