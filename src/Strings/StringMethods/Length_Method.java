package Strings.StringMethods;

import java.util.Scanner;

public class Length_Method {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your full name: ");

        String name = s.nextLine();

        int length = name.length();

        System.out.printf("Total words present in your name '%s' including spaces are " + length,name);
    }
}

/*
🔸Total words present in your name 'Harsh Mehra' including spaces are 11
 */
