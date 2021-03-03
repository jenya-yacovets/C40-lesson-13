package by.tms.shop.app.actions;

import by.tms.shop.app.exceptions.StopAppException;
import by.tms.shop.entity.Shop;

public class StopAppAction implements Action{
    @Override
    public void execute() throws StopAppException {
        Shop.getInstance().save();
        throw new StopAppException();
    }
}
