package by.tms.shop.entity;

import by.tms.shop.exceptions.DuplicateProductException;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products;
    private static Shop instance;
    private Shop() {
        products = new ArrayList<>();
    }

    public static Shop getInstance() {
        if(instance == null) {
            instance = new Shop();
        }

        return instance;
    }

    public void addProduct(Product product) throws DuplicateProductException {
        if(products.contains(product)) {
            throw new DuplicateProductException(product.getId());
        }
        products.add(product);
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public void updateProduct(Product product) {
        int index = products.indexOf(product);
        if(index != -1) {
            products.set(index, product);
        }
    }

    public void deleteProduct(int id) {
        products.remove(new Product(id));
    }

    public void save() {

    }
}
