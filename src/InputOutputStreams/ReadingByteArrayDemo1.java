package InputOutputStreams;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ReadingByteArrayDemo1 {
    public static void main(String[] args) {

        byte[] b = {'H', 'A', 'R', 'S', 'H'};

        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(b);

            int x;
            while ((x = bis.read()) != -1)
            {
                System.out.print((char) x + " ");
            }
            bis.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
/*
🔶 Here we are reading single byte at a time with the help of while loop to iterate over the whole byte array input stream
 */
