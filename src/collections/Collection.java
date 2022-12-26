package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collection {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Eggs",1,30f));
        list.add(new Product("Milk",2,35f));
        list.add(new Product("Veg meals",3,50f));
        //printing the products by using Stream API
        List<Float> list1 = list.stream().filter(p-> p.price>20).map(p-> p.price).collect(Collectors.toList());
        System.out.println(list);
    }
}
