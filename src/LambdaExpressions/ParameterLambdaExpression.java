package LambdaExpressions;

public class ParameterLambdaExpression {
    public static void main(String[] args) {

        MySum s = (a, b) -> a + b;

        int totalSum = s.sum(10, 20);

        System.out.printf("The sum of a + b is %d.",totalSum);

        //🔸Output:  The sum of a + b is 30.
    }
}

@FunctionalInterface
interface MySum
{
    public int sum(int x, int y);
}
