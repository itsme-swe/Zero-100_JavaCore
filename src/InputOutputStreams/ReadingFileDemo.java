package InputOutputStreams;

import java.io.FileInputStream;

public class ReadingFileDemo {
    public static void main(String[] args) throws Exception {

        try (FileInputStream fis = new FileInputStream("E:/Docs/Text.txt")){

            byte[] b = new byte[fis.available()];

           fis.read(b);

           String str = new String(b);

            System.out.println(str);

        }

    }
}
