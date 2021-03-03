package by.tms.shop.app.actions;

import by.tms.shop.entity.Product;
import by.tms.shop.entity.Shop;

import java.util.List;

public class ShowProductsAction implements Action{
    @Override
    public void execute() {
        List<Product> products = Shop.getInstance().getProducts();
        System.out.println("****** Список товаров ******");
        for(Product p : products) {
            System.out.println(p);
        }
        System.out.println("****************************");
    }
}
