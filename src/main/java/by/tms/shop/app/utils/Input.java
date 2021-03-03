package by.tms.shop.app.utils;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static int getInt(){
        if(scanner.hasNextInt()) {
            int res = scanner.nextInt();
            scanner.nextLine();
            return res;
        }
        scanner.next();
        System.out.println("Вы ввели не целое число, повторите ввод:");
        return getInt();
    }

    public static int getInt(String message){
        System.out.println(message);
        return getInt();
    }

    public static String getStr(){
        return scanner.nextLine();
    }

    public static String getStr(String message){
        System.out.println(message);
        return getStr();
    }
}
