package InputFromUser;

import java.util.Scanner;

public class InputStringVal {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter your full name: ");

        String name = s.nextLine().toUpperCase();

        System.out.println(name);       //🔸Output: HARSH MEHRA

    }
}
