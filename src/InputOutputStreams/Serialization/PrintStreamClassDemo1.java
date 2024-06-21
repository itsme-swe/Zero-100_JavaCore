/*
🔶 In this program we are just writing an object inside the text file using PrintStream Class
 */

package InputOutputStreams.Serialization;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.Serializable;

class Student implements Serializable
{
    int rollNo;
    String name;
    String dept;

    Student()
    {}
}
public class PrintStreamClassDemo1 {
    public static void main(String[] args) throws Exception {

        //1️⃣ FileOutputStream object created to create new file
        FileOutputStream fos = new FileOutputStream("E:/IOStreamDocs/Student1.txt");

        //2️⃣ PrintStream object to print inside the file
        PrintStream ps = new PrintStream(fos);

        //3️⃣ Creating an object of Student Class and initializing its properties
        Student s1 = new Student();

        s1.rollNo = 101;
        s1.name = "Johnathan";
        s1.dept = "Computer Science";

        //4️⃣ Now printing objects inside file
        ps.println(s1.rollNo);
        ps.println(s1.name);
        ps.println(s1.dept);

        ps.close();
        fos.close();

    }
}
