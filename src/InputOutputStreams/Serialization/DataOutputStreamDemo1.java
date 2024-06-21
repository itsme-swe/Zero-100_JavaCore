
/*
🔶 DataOutputStream is used for writing primitive Java data types to an output stream.
 */
package InputOutputStreams.Serialization;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamDemo1 {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("E:/IOStreamDocs/Student2.txt");

            DataOutputStream dos = new DataOutputStream(fos);

            Student s2 = new Student();

            s2.rollNo = 102;
            s2.name = "Jordan";
            s2.dept = "MBA";

            dos.writeInt(s2.rollNo);
            dos.writeUTF(s2.name);
            dos.writeUTF(s2.dept);

            dos.close();
            fos.close();


        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
