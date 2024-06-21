package InputOutputStreams;

import java.io.File;
import java.io.FileOutputStream;

public class FileClassDemo2 {
    public static void main(String[] args) throws Exception {

        File f = new File("E:/Docs/Destination.txt");

//        f.setReadOnly();    //1️⃣ With the help of setReadOnly() method we can just read the file

        f.setWritable(true);  //2️⃣ After using setWritable(true) now we can write and read the file

        FileOutputStream fos = new FileOutputStream("E:/Docs/Destination.txt");     //3️⃣ Here this will give us error because we set file to readonly.


    }
}
