import java.util.*;
import java.io.*;

public class ScannerFileDemo {
    public static void main(String[] args) throws Exception{
        File file = new File("D:\\files\\data.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());

        }
         

    }
}