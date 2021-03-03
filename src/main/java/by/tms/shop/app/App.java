package by.tms.shop.app;

import by.tms.shop.app.buttons.Button;
import by.tms.shop.app.config.ButtonsConfig;
import by.tms.shop.app.exceptions.StopAppException;
import by.tms.shop.app.utils.Input;

import java.util.Map;

public class App {
    public void start() {
        System.out.println("Привет");
        run();
        System.out.println("Пока");
    }

    private void run() {
        while (true) {
            Button button = selectButton();
            try {
                button.click();
            } catch (StopAppException e) {
                break;
            }
        }
    }

    private Button selectButton() {
        showMenu();
        int number = Input.getInt("Выберите действие:");
        if (ButtonsConfig.buttons.containsKey(number)) {
            return ButtonsConfig.buttons.get(number);
        }
        System.out.println("Нет такого действия, потворите действие:");
        return selectButton();
    }

    private void showMenu() {
        for(Map.Entry<Integer, Button> item : ButtonsConfig.buttons.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }
}
