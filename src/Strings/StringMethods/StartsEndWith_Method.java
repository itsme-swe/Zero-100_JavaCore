package Strings.StringMethods;

public class StartsEndWith_Method {
    public static void main(String[] args) {

        String email = "harsh@gmail.com";

        System.out.println(email.startsWith("harsh"));      //🔸true
        System.out.println(email.endsWith("@"));            //🔸false
    }
}
