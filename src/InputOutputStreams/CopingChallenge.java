package InputOutputStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopingChallenge {
    public static void main(String[] args) throws Exception {

        //🔸Creating new file using FileOutputStream
        try (FileOutputStream fos = new FileOutputStream("E:/Docs/Source.txt")){

            String str = "WELCOME TO THE WORLD";    //🔸Content inside file

            fos.write(str.getBytes());      //🔸Converting String into bytes

            //🔸Now here we are reading the file using FileInputStream
            FileInputStream fis = new FileInputStream("E:/Docs/Source.txt");

            //🔸And, here creating new file again
            FileOutputStream fs = new FileOutputStream("E:/Docs/Source2.txt");

            int b;
            //🔸Here reading file from "Source.txt" and storing into variable b amd it will read until byte reaches to -1.
            while ((b = fis.read()) != -1)
            {
                //🔸Condition to convert UpperCases to LowerCases using ASCII values. If bytes lying b/w 65-90, then we'll add 32 into it to make it in LowerCase.
                if (b >= 65 && b <= 90) fs.write(b+32);
                else fs.write(b);
            }
            fis.close();
            fs.close();
        }

    }
}
