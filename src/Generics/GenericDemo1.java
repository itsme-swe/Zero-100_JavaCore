package Generics;

//1️⃣ This class can hold any type of Object so we using set() method to set the object and get() method to print the object
class Data<T>
{
    private T obj;

    public void setData(T v)
    {
        obj = v;
    }

    public T getData()
    {
        return obj;
    }
}
public class GenericDemo1 {
    public static void main(String[] args) {

        //2️⃣ This object will hold only String type data into it.
        Data <String> d = new Data<>();

        d.setData("Hi I am Harsh");

        System.out.println(d.getData());

    }
}
