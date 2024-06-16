package Strings.StringMethods;

public class Join_method {
    public static void main(String[] args) {

        String s = "Harsh";
        String c = "Virtus";
        String p = "trip";

        System.out.println(String.join("-",s,c,p));     //🔸Harsh-Virtus-trip

    }
}

/*
🔸Join Method is the static method of String class.

🔸Syntax: String.join(CharSequence delimter, charSequence...elements)
* */