package org.ymca;

import java.util.*;

public class ProductsDB {
    private static ProductsDB instance = new ProductsDB();

    Map<Integer, Product> productMap = new HashMap<Integer, Product>();

    public ProductsDB() {

        //Initialize the DB with some sample data

        addProduct(1, "Cocacola", 10, 1000);
        addProduct(2, "Pepsi", 8.5, 2000);
        addProduct(3, "Strongbow", 20, 1234);
        addProduct(5, "Cocacola", 10, 1000);
        addProduct(6, "Cocacola", 10, 1000);
        addProduct(7, "Seven Up", 9, 1711);
        addProduct(8, "Cocacola", 10, 1000);
        addProduct(10, "Sa xi Chuong Duong", 22, 1992);
        addProduct(12, "Cocacola", 10, 1000);
        addProduct(13, "Merinda", 12, 99);
    }

    public static ProductsDB getInstance() {
        return instance;
    }

    private void addProduct(int id, String name, double price, int remainingAmount) {
        Product product = new Product(id, name, price, remainingAmount);
        productMap.put(id, product);
    }

    public Product getProduct(int id) {
        return productMap.get(id);
    }

    public Collection<Product> getAllProducts() {
        return productMap.values();
    }
}
