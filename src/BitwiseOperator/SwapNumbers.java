package BitwiseOperator;

public class SwapNumbers {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.printf("The value of a is %d\n",a);
        System.out.printf("The value of b is %d",b);
    }
}

/*
🔸  The value of a is 20
    The value of b is 10

*/
