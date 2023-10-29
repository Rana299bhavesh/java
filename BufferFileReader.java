import java.io.*;
public class BufferFileReader{
    public static void main(String [] args) throws IOException{
        FileReader fr = new FileReader("D:\\files\\data.txt");
        BufferedReader br = new BufferedReader(fr);

        String data;
        while((data = br.readLine()) !=null)
            System.out.println(data);
            br.close();
        
    } 
    
}
