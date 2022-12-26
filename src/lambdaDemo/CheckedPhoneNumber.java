package lambdaDemo;

public class CheckedPhoneNumber {
    public  static void checkPhoneNo(String num){
        if (num.length ()!=10) {
            throw new RuntimeException("The Mobile number is Not correct");
        }else{
            System.out.println("The mobile number is correct");


        }
    }

    public static void main(String[] args) {
        checkPhoneNo("8790662584");
    }
}
