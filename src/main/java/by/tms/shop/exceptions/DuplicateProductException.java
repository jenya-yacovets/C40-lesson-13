package by.tms.shop.exceptions;

public class DuplicateProductException extends Exception{
    private int id;

    public DuplicateProductException(int id) {
        this.id = id;
    }

    @Override
    public String getMessage() {
        return "Продукт с id - " + id + " уже существует!";
    }
}
