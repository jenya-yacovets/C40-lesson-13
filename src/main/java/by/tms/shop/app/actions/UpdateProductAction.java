package by.tms.shop.app.actions;

import by.tms.shop.app.utils.Input;
import by.tms.shop.entity.Product;
import by.tms.shop.entity.Shop;

public class UpdateProductAction implements Action{
    @Override
    public void execute() {
        int id = Input.getInt("Введите id:");
        String name = Input.getStr("Введите название:");
        int price = Input.getInt("Введите цену:");

        Product product = new Product(id, name, price);

        Shop.getInstance().updateProduct(product);
    }
}
