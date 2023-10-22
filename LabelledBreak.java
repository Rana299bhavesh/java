public class LabelledBreak {
    public static void main(String[] args){
        firstforloop: for(int i=1; i<5; i++){
            Secondforloop: for(int j=1; j<4; j++){
                if(i==3){

                    break firstforloop;
                }
                System.out.println("i= "+ i + "j= " +j);
            }
        }

    }
    
}
