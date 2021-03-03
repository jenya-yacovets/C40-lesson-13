package by.tms.shop.app.actions;

import by.tms.shop.app.exceptions.StopAppException;

public interface Action {
    void execute() throws StopAppException;
}
