package InputOutputStreams;

import java.io.RandomAccessFile;

public class RandomAccessFileClassDemo1 {
    public static void main(String[] args) {

        try (RandomAccessFile raf = new RandomAccessFile("E:/Docs/Data.txt", "rw")){

            System.out.println((char)raf.read());
            System.out.println((char)raf.read());
            System.out.println((char)raf.read());

            raf.write('e');

            raf.skipBytes(2);       //🔸Method used to skip the bytes

            System.out.println((char) raf.read());
            System.out.println((char) raf.read());

            raf.seek(2);        //🔸Passing index value to seek the pointer
            System.out.println((char) raf.read());


        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
