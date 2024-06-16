package Strings.StringMethods;

public class Equals_Method {
    public static void main(String[] args) {

        String s = "Harsh";

        String s1 = new String("Harsh");

        String s2 = new String("Harsh");

        String s3 = "Harsh";

        System.out.println(s1.equals(s2));      //🔸true bcoz both the String content is same.

        System.out.println(s1 == s2);           //🔸 false bcoz s2 is creating new object

        System.out.println(s == s1);            //🔸 false

        System.out.println(s == s3);            //🔸 true bcoz both are pointing towards same object


    }
}

/*
🔸equals() method check the content of String

🔸 == check the reference of the Object

 */
