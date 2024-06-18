package LambdaExpressions;

interface Lambda1
{
    public void display(String str);
}

class LambDemo
{
    public void reverse(String str)
    {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
}
public class NonStaticMember {
    public static void main(String[] args) {

        LambDemo ld = new LambDemo();

        Lambda1 ml = ld::reverse;

        ml.display("Hello");
    }
}
