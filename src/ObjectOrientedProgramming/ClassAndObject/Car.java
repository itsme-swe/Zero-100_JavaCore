package ObjectOrientedProgramming.ClassAndObject;

public class Car {

    //🔸Properties/Attributes defined inside the class are known as Instance variables
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuel;

    //🔸Methods declared inside class is known as Instance Methods
    public void drive()
    {
        System.out.println("Car is driving");
    }

    public void addFuel(float fuel)
    {
        currentFuel += fuel;
    }
}
