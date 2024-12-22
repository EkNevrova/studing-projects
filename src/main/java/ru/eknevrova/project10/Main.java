package ru.eknevrova.project10;

public class Main {
    public static void main(String args[]) {
        Account account = new Account();

        String[] usersLogins = {null, "nick", "normalLogin", "abracadabraLongLogin2024"};

        for (String login : usersLogins) {
            try {
                account.checkLogin(login);
                System.out.println("Логин зарегистрирован: " + account.getLogin());
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("------------------------------");
        //проверка правильного пароля
        try {
            account.checkPassword("correctPassword", "correctPassword");
            System.out.println("Пароль установлен: " + account.getPassword());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }

        //проверка неправильного пароля
        try {
            account.checkPassword("word", "word");
            System.out.println("Пароль установлен: " + account.getPassword());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.checkPassword("password1", "password2");
            System.out.println("Пароль установлен: " + account.getPassword());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("------------------------------");
        try {
            account.checkLoginAndPassword("normalLogin", "correctPassword");
        } catch (WrongLoginOrPasswordException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.checkLoginAndPassword("wrongLogin", "wrongPassword");
        } catch (WrongLoginOrPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}