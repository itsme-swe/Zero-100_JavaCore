package InputOutputStreams;

import java.io.File;

public class FileClassDemo1 {
    public static void main(String[] args) {

        //🔸Creating object of File class
        File f = new File("E:/Docs");

        System.out.println(f.isDirectory());        //🔸true

        //1️⃣list method is used to list the files in the Directory, but this method returns an Array of strings.
        String[] list = f.list();

        //2️⃣ Iterating over the String array of a list
        for (String x : list){
            System.out.println(x);
        }

        //3️⃣Another method is used to see the files present in the directory if Files method, and it returns Array of Files.
        File[] list1 = f.listFiles();

        //4️⃣Iterating over the File Array and getting the file name along with its destination
        for (File x : list1){
            System.out.print(x.getName() + " ");
            System.out.println(x.getPath());
        }

    }
}
