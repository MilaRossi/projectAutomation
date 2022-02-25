package ru.yandex.praktikum;

public class Account {

    private String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        if (name == null) {
            System.out.println("Имя равно null");
            return false;
        }

        if (name.isEmpty()) {
            System.out.println("Имя не заполнено");
            return false;
        }

        if (name.isBlank()) {
            System.out.println("Имя состоит из пробелов");
            return false;
        }

        name = name.trim();

        if (name.length() < 3) {
            System.out.println(name + " Имя короче 3 символов");
            return false;
        }
        if (name.length() > 19) {
            System.out.println(name + " Имя длиннее 19 символов");
            return false;
        }

        if(countSpaces() < 1) {
            System.out.println("В середине строки нет пробела");
            return false;
        }

        if(countSpaces() > 1) {
            System.out.println("В середине строки больше 1 пробела");
            return false;
        }

        System.out.println(name + " Имя соответствует условиям, можно печатать");
        return true;
    }

    public int countSpaces () {
        return name.split(" ").length-1;
    }
}
