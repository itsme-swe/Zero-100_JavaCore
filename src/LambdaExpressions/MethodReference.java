package LambdaExpressions;

@FunctionalInterface
interface MyNewLambda
{
    public void display(String str);

}
public class MethodReference {
    public static void main(String[] args) {

        MyNewLambda ml = System.out::println;
        ml.display("Hello World!!!");
    }
}


