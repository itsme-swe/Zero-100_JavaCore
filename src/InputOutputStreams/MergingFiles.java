/*
◽ In this challenge, we need to create two files and merge their content into another file.
 */

package InputOutputStreams;

import java.io.*;

public class MergingFiles {
    public static void main(String[] args)  {
        try {
            FileInputStream fis1 = new FileInputStream("E:/Docs/Source.txt");
            FileInputStream fis2 = new FileInputStream("E:/Docs/Source2.txt");

            FileOutputStream fos = new FileOutputStream("E:/Docs/Destination.txt");

            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);


            int b;
            while ((b = sis.read()) != -1)
            {
                fos.write(b);
            }
            sis.close();
            fis1.close();
            fis2.close();
            fos.close();

        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e){
            System.out.println(e);
        }

    }
}
