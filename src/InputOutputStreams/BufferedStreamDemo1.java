package InputOutputStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedStreamDemo1 {
    public static void main(String[] args) {

        //🔸Creating Object of FileInputStream inside try-and-resources
        try (FileInputStream fis = new FileInputStream("E:/Docs/Destination.txt")){

            BufferedInputStream bis = new BufferedInputStream(fis);     //🔸Now "bis" ref. of BufferedInputStream class is upon "fis" ref. of FileInputStream

            System.out.println("FileInputStream: " + fis.markSupported());  //🔸Output: false

            System.out.println("BufferedInputStream: "+ bis.markSupported());   //🔸Output: true

            int x;
            while ((x = bis.read()) != -1)
            {
                System.out.println((char) x);
            }

        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
