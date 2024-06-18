package InputOutputStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingToFile {
    public static void main(String[] args) {

        try {
            //🔸 Creating object and passing path and file name as parameter
            FileOutputStream fos = new FileOutputStream("E:/JavaDocs/Text.txt");

            String str = "Learn Java Programming";      //🔸Content to be written inside the file

            fos.write(str.getBytes());      //🔸Converting string into bytes

            fos.close();

        } catch (FileNotFoundException e)
        {
            System.out.println(e);
            e.printStackTrace();
        } catch (IOException e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
