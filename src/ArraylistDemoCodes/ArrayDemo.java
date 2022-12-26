package ArraylistDemoCodes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Sreekanth");
        list.add("Ram");
        list.add("Raghu");
        list.add("Sanjay");
        list.add("Samuel");

        ArrayDemo d = new ArrayDemo();
        d.removeElement(list);//passing ArrayList reference as parameter
    }
    public void removeElement(ArrayList<String> list){//passing ArrayList reference as parameter
        Scanner sc =new Scanner(System.in);
            String remove = sc.next();
        for (int i = 0; i<list.size(); i++){
            if (list.get(i).equals(remove)){
                 list.remove(i);
            }
        }
        System.out.println(list);
    }
}
