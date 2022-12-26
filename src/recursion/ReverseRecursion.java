package recursion;

public class ReverseRecursion {
    public static void display(int a) {
        if (a < 11)
            display(a + 1);
        System.out.println(a);
    }

    public static void main(String[] args) {

        display(1);
    }
}