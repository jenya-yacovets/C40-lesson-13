package by.tms.shop.app.config;

import by.tms.shop.app.actions.*;
import by.tms.shop.app.buttons.Button;

import java.util.HashMap;
import java.util.Map;

public class ButtonsConfig {
    public static Map<Integer, Button> buttons = new HashMap<>();

   static {
       buttons.put(1, new Button("Добавить товар", new AddProductAction()));
       buttons.put(2, new Button("Просмотреть все товар", new ShowProductsAction()));
       buttons.put(3, new Button("Редактировать товар", new UpdateProductAction()));
       buttons.put(4, new Button("Удалить товар", new DeleteProductAction()));
       buttons.put(0, new Button("Выход", new StopAppAction()));
   }
}
