package LambdaExpressions;


public class LambdaDemo {
    public static void main(String[] args) {

        MyLambda m = () -> {
            System.out.println("Hello world;");
        };
        m.display();

        //🔸Output: Hello World
    }
}

@FunctionalInterface    // Annotation
interface MyLambda
{
    public void display();

}

