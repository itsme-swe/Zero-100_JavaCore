package InputOutputStreams.Serialization;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamDemo2 {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("E:/IOStreamDocs/Student2.txt");

            DataInputStream dis = new DataInputStream(fis);

            Student s2 = new Student();

            s2.rollNo = dis.readInt();
            s2.name = dis.readUTF();
            s2.dept = dis.readUTF();

            System.out.println("RollNo: " + s2.rollNo);
            System.out.println("StudentName: " + s2.name);
            System.out.println("Department: " + s2.dept);

        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
