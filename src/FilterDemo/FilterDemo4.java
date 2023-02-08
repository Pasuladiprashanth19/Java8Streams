package FilterDemo;

import java.util.ArrayList;
import java.util.List;

class Product {
    int id;
    String name;
    double price;


    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}


public class FilterDemo4 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1,"Hp laptop",35000));
        productList.add(new Product(2,"Dell laptop",3000));
        productList.add(new Product(3,"Asus laptop",28000));
        productList.add(new Product(4,"Apple laptop",90000));


        productList.stream().filter(p->p.price>25000) //filtering
                .forEach(pr-> System.out.println(pr.price));//iterating
    }
}
