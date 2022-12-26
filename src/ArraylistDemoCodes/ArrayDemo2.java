package ArraylistDemoCodes;

import java.util.ArrayList;

public class ArrayDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i=0; i<=100; i++){
            arrayList.add(i);

        }
        System.out.println("the numbers in the arrayList are:"+ arrayList);
        System.out.println();
        ArrayDemo2 arrayDemo2 = new ArrayDemo2();
        arrayDemo2.filterOdd(arrayList,arrayList1);
    }
    public void filterOdd(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList1){
        for (int i=0; i<arrayList.size();i++){
          if (i%2!=0){
              arrayList1.add(i);

            }
        }
        System.out.println("the odd numbers in the arrayList are:"+arrayList1);
    }
}
