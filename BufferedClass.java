import java.io.*;
public class BufferedClass {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter a name: ");
        String name = br.readLine();
        System.out.println(name);


    }
    
}
