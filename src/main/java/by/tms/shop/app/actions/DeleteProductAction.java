package by.tms.shop.app.actions;

import by.tms.shop.app.utils.Input;
import by.tms.shop.entity.Shop;

public class DeleteProductAction implements Action{
    @Override
    public void execute() {
        int id = Input.getInt("Введите Id:");
        Shop.getInstance().deleteProduct(id);
    }
}
