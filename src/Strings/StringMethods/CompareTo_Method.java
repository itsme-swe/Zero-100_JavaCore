package Strings.StringMethods;

public class CompareTo_Method {
    public static void main(String[] args) {

        String s = "Harsh";

        String s1 = "harsh";

        String s2 = "Juhi";

        System.out.println(s.compareTo(s1));        //🔸Output: -32

        System.out.println(s1.compareTo(s2));       //🔸Output: -30

    }
}
