/*
🔶 Here we'll be reading the file created with the PrintStream class
 */
package InputOutputStreams.Serialization;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BufferReaderDemo1 {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("E:/IOStreamDocs/Student1.txt");

            BufferedReader br = new BufferedReader(new InputStreamReader(fis));     //1️⃣ converting byte stream into character stream

            Student s1 = new Student();

            s1.rollNo = Integer.parseInt(br.readLine());
            s1.name = br.readLine();
            s1.dept = br.readLine();

            System.out.println("RollNo: " + s1.rollNo);
            System.out.println("StudentName: " + s1.name);
            System.out.println("Department: " + s1.dept);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
