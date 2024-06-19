package InputOutputStreams;

import java.io.CharArrayReader;
import java.io.IOException;

public class ReadingCharArrayDemo2 {
    public static void main(String[] args) {

        char[] ch = {'J','A','V','A','D','E','V'};

        // Created Object of CharArrayReader and passed character array "ch" as parameter
        try (CharArrayReader cr = new CharArrayReader(ch)){

            int x;
            while ((x = cr.read()) != -1){
                System.out.print((char) x + " ");       // typecasting converting ASCII values to character
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}

/*
🔶 In this Demo Class we are reading from Char Array
* */
