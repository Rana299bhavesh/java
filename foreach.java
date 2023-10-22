public class foreach {
    public static void main(String[] args){
        int a[] = {2,5,3,76,43,31,53,98};
        /*for(int i=0; i<a.length ; i++){
            System.out.println(a[i]);

        }*/
        for(int i : a){
            System.out.println(i);
        }

    }
    
}
