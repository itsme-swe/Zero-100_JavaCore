package InputOutputStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingCharArrayDemo1 {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("E:/Docs/Source.txt");) {

            byte[] b = fis.readAllBytes();

            String str = new String(b);

//            char[] ch = new String(b).toCharArray();
//
//            CharArrayReader cr = new CharArrayReader(ch);

//            int x;
//            while ((x = cr.read()) != -1){
//                System.out.println((char) x);
//            }
            for (char c : str.toCharArray()){
                System.out.print(c + " ");
            }

        }catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
/*
🔶 This is the optimized approach to read a character array from stream
 */
