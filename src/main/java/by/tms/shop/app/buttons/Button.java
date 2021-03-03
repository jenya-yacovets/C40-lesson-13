package by.tms.shop.app.buttons;

import by.tms.shop.app.actions.Action;
import by.tms.shop.app.exceptions.StopAppException;

public class Button {
    private String name;
    private Action action;

    public Button(String name, Action action) {
        this.name = name;
        this.action = action;
    }

    public Button() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return name;
    }

    public  void click() throws StopAppException {
        action.execute();
    }
}
