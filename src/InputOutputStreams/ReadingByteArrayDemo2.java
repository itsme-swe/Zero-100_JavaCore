package InputOutputStreams;

import java.io.ByteArrayInputStream;

public class ReadingByteArrayDemo2 {
    public static void main(String[] args) throws Exception{

        byte[] b = {'M', 'E', 'R', 'I', 'M', 'A', 'A'};

        ByteArrayInputStream bis = new ByteArrayInputStream(b);

        String str = new String(bis.readAllBytes());

        System.out.print(str);
    }
}

/*
🔶 Here we are reading from Byte Array, but this time we are reading all bytes together, so to read all bytes together we need to convert a byte array into string.
 */

