package LambdaExpressions;

public class LambdaExpressionAsParameter {
    public static void main(String[] args) {
        Demo d = new Demo();

        d.method1();
    }
}

@FunctionalInterface
interface newLambda
{
    public void display();
}

class useLambda
{
    public void callLambda(newLambda ml)
    {
        ml.display();
    }
}

class Demo
{
    public void method1()
    {
        useLambda u = new useLambda();
        u.callLambda(() -> {
            System.out.println("Hello");
        });
    }
}
