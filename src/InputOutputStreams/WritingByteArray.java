package InputOutputStreams;

import java.io.ByteArrayOutputStream;

public class WritingByteArray {
    public static void main(String[] args) throws Exception{

        // Creating an object of byte array output stream and passing the size of byte array as parameter.
        ByteArrayOutputStream bos = new ByteArrayOutputStream(10);

        bos.write('H');
        bos.write('A');
        bos.write('R');
        bos.write('S');
        bos.write('H');

        byte[] b = bos.toByteArray();   // Converting bytes into byteArray

        // Using forEach loop to traverse byteArray
        for(byte x : b ){
            System.out.println((char)x);    // typecasting ASCII values into characters
        }
        bos.close();
    }
}
