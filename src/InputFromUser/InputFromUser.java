package InputFromUser;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {

        try(Scanner s = new Scanner(System.in)) {
            int a, b, c;

            System.out.println("Enter two numbers: ");

            a = s.nextInt();
            b = s.nextInt();
            c = a + b;

            System.out.printf("The sum of %d and %d is " + c, a, b);
        }

    }
}

/*
🔸Output: The sum of 10 and 20 is 30
 */
