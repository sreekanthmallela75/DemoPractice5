package lambdaDemo;

public class LambdaExpressions {
    public static void main(String[] args) {


        Numbers n = (a) -> {
           int b = 10;
            int c = 40;
            int d = b + c;
            System.out.println(d);
            System.out.println(a);

        };
            n.integers(10);
    }
}