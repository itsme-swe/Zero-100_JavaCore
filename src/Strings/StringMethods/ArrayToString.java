package Strings.StringMethods;

public class ArrayToString {
    public static void main(String[] args) {

        char[] c = {'H', 'A', 'R', 'S', 'H'};

        String name = new String(c);

        System.out.println(name.equals(c));     // false
        System.out.println(name);       // Harsh
    }
}
