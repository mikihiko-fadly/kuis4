package main.java.com.kuis4.coffee.services;

import java.util.ArrayList;
import java.util.List;

public class CoffeService {
    @Service
    public class CoffeProduct {
        public List <Product> getAllProduct() {
            List<Product> products = new ArrayList<>();
            products.add(new Product(1,"arabika", 23000, "sedang"));
            products.add(new Product(2,"espresso", 24000, "besar"));
            products.add(new Product(3,"amerikano", 25000, "mini"));
            return products;
        }
    }

}
