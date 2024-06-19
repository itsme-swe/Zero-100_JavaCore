package InputOutputStreams;

import java.io.FileOutputStream;

public class WritingToFile2 {
    public static void main(String[] args) throws Exception {

        try ( FileOutputStream fos = new FileOutputStream("E:/JavaDocs/Text2.txt");) {

            String str1 = "Learning Core Java";

            fos.write(str1.getBytes());
        }
    }
}

/*
◽This is another method to create file using FileOutputStream. Here we are not using any try and catch block instead of using try block we are try-and-resources and inplace of catch block we are throwing excepting by using throws Exception.
* */
