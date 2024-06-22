/*
🔶 This Array can hold any type of data
 */
package Generics;

@SuppressWarnings("unchecked")
class MyArray<T>
{
    T[] A = (T[]) new Object[10];
    int length = 0;

    //1️⃣ This method will add the values inside the array
    public void append(T value)
    {
        A[length++] = value;
    }

    public void display()
    {
        for (int i = 0; i < length; i++){
            System.out.print(A[i] + " ");
        }
    }

}

public class GenericArrayDemo2 {
    public static void main(String[] args) {

        MyArray <Integer> ma = new MyArray<>();     //2️⃣ Right now this array is working for an Integer type if we need to use for a different type than we need to change the type

        ma.append(10);
        ma.append(20);
        ma.append(25);
        ma.append(30);
        ma.append(35);

        ma.display();
    }
}
