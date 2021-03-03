package by.tms.shop.app.actions;

import by.tms.shop.app.utils.Input;
import by.tms.shop.entity.Product;
import by.tms.shop.entity.Shop;
import by.tms.shop.exceptions.DuplicateProductException;

public class AddProductAction implements Action{
    @Override
    public void execute() {
        int id = Input.getInt("Введите id:");
        String name = Input.getStr("Введите название:");
        int price = Input.getInt("Введите цену:");

        Product product = new Product(id, name, price);

        try {
            Shop.getInstance().addProduct(product);
        } catch (DuplicateProductException e) {
            e.printStackTrace();
        }
    }
}
