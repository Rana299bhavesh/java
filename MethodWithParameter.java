public class MethodWithParameter {
    public static void main(String[] args){
        int a=10;
        int b=20;
        int c=30;
        int d=a+b+c;
        System.out.println("Total marks: " + d);
        
        int e=40, f=50, g=60;
        int h = e+f+g;
        System.out.println("Total marks: " + h);


        MethodWithParameter mwp =new MethodWithParameter();
        mwp.studentMarks(10,20,30);
        mwp.studentMarks(40, 59, 60);


    }

    public void studentMarks(int sub1Marks, int sub2Marks, int sub3Marks ){
        int totalMarks= sub1Marks + sub2Marks + sub3Marks;
        System.out.println("Total marks: " + totalMarks);
    }



    
}
