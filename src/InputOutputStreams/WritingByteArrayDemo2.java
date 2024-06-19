package InputOutputStreams;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class WritingByteArrayDemo2 {
    public static void main(String[] args) throws Exception {

        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);

        bos.write('J');
        bos.write('A');
        bos.write('V');
        bos.write('A');
        bos.write('D');
        bos.write('E');
        bos.write('V');

        bos.writeTo(new FileOutputStream("E:/Docs/Source.txt"));

        bos.close();
    }
}
