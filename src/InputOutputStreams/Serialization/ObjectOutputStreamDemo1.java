package InputOutputStreams.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo1 {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("E:/IOStreamDocs/Student3.txt");

            //1️⃣ Now to achieve serialization creating an object of ObjectOutputStream to write a file
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            Student s3 = new Student();
            s3.rollNo = 103;
            s3.name = "Ram";
            s3.dept = "MLAI";

            oos.writeObject(s3);

            oos.close();
            fos.close();

        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
