package Conversion_Types;

import java.util.Scanner;

public class StringFormatting {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = s.nextLine();

        System.out.print("Enter your age: ");
        int age = s.nextInt();

        System.out.print("Enter your height: ");
        float height = s.nextFloat();

        System.out.printf("Hello, I am %s and I am %d years old and my height is %1.1f feet.",name, age, height);
    }
}

/*
🔸 Enter your full name: Harsh Mehra
    Enter your age: 32
    Enter your height: 5.6
    Hello, I am Harsh Mehra and I am 32 years old and my height is 5.6 feet.

 */
