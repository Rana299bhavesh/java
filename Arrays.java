public class Arrays {
    public static void main(String[] args){
        int arr[];
        arr =new int[4];

        arr= new int[4]; //allocating  new memory to  the array

        arr[0]=34;
        arr[1]=67;
        arr[2]=55;
        arr[3]=45;

        System.out.println(arr[2]);

        //array literals
        int array1[] = {30,76,85,80,74,41};
        System.out.println(array1[3]);

        System.out.println("Array Length: " + arr.length);
        System.out.println("Array Length: " + array1.length);//Length of array

        //reassigning the value of array
        arr[3] = 33;
        System.out.println(arr[3]);



    }
    
}
