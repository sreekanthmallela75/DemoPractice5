package ArraylistDemoCodes;

import java.util.ArrayList;

public class ArrayDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        System.out.println("the elements of n array is:");
        for (int i=0; i<=100;i++){

            arrayList.add(i);
        }
        System.out.println( "numbers" +arrayList);
        System.out.println();
        ArrayDemo1 arrayDemo1 = new ArrayDemo1();
        arrayDemo1.filterEven(arrayList,arrayList1);
    }



    public void filterEven(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList1){
        for (int i=0; i<arrayList.size();i++){
            if (i%2==0){
             //   System.out.println("the even numbers in the arrayList are:");
                arrayList1.add(i);
            }
        }
        System.out.println("the even numbers in the arrayList are:"+arrayList1);

    }
}
