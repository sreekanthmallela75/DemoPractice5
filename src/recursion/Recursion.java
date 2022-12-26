package recursion;

public class Recursion {
    public static void display(int a){
        if (a>1){
            display(a-1);
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        display(11);
    }
}
