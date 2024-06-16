package Strings.StringMethods;

import java.util.Scanner;

public class IsEmpty_Method {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your new car name: ");

        String carName = s.nextLine();

        if (carName.isEmpty()){
            System.out.println("Car name field cannot be empty");
        }
        else {
            System.out.printf("Your new car %s is ready to go.", carName);
        }
    }
}
