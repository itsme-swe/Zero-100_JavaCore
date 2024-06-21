package InputOutputStreams.Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo2 {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("E:/IOStreamDocs/Student3.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s3;

        s3 = (Student)ois.readObject();

        System.out.println("RollNo: " + s3.rollNo);
        System.out.println("StudentName: " + s3.name);
        System.out.println("Department: " + s3.dept);


    }
}
