package ru.eknevrova.project10;

//Task1: Создайте класс Аккаунт, в котором будет текстовое поле Логин и метод checkLogin,
// который принимает на вход строку с логином пользователя. В данном методе проверьте,
// что введенный логин не равен null и его длина больше 5 и меньше 20. Если условия выполнены,
// то присвойте его значение полю Логин класса Аккаунт, иначе выбросите собственную ошибку
// WrongLoginException и обработайте ее с выводом на экран.
//
//Task2:  В уже созданный вами класс Аккаунт добавьте поле Пароль. Добавьте метод checkPassword,
// который будет принимать на вход два строковых параметра: пароль и подтверждение пароля.
// Проверьте, что пароль не равен null, его длина больше 8 и меньше 20, а также что значения строки
// пароль и подтверждение пароля совпадают. Если условия выполнены, то присвойте значение пароля полю
// Пароль класса Аккаунт, иначе выбросите собственную ошибку WrongPasswordException и обработайте
// ее с выводом на экран.
//
//Task3: В класс Аккаунт добавьте поле типа HashMap с парами логинов пользователей и паролей. Добавьте
// метод checkLoginAndPassword, который будет принимать на вход строку логина и строку пароля и проверять,
// содержится ли такая пара в поле типа HashMap. В случае успеха верните строку “Вы успешно вошли в аккаунт!”.
// В случае неудачи выбросите собственную ошибку WrongLoginOrPasswordException и обработайте ее с выводом на экран.

import java.util.HashMap;

public class Account {
    private String login;
    private String password;
    private HashMap<String, String> userAccount = new HashMap<>();

    public void checkLogin (String userLogin) throws WrongLoginException {
        if (userLogin == null || userLogin.length() <= 5 || userLogin.length() >= 20) {
            throw new WrongLoginException ("Ошибка: Недопустимая длина логина");
        }
        this.login = userLogin;
    }

    public String getLogin() {
        return login;
    }

    public void checkPassword (String password1, String password2) throws WrongPasswordException {
        if (password1 == null || password1.length() <= 8 || password1.length() >= 20) {
            throw new WrongPasswordException ("Ошибка: Недопустимая длина пароля");
        }
        if (!password1.equals(password2)) {
            throw new WrongPasswordException ("Ошибка: Пароль и подтверждение пароля не совпадают");
        }
        this.password = password1;

        userAccount.put(this.login, this.password);
    }

    public String getPassword() {
        return password;
    }

    public void checkLoginAndPassword (String userLoginCor, String userPasswordCor) throws WrongLoginOrPasswordException {
        if (userAccount.containsKey(userLoginCor) && userAccount.get(userLoginCor).equals(userPasswordCor)) {
            System.out.println("Вы успешно вошли в аккаунт!");
        } else {
            throw new WrongLoginOrPasswordException ("Ошибка: Неверный логин или пароль");
        }
    }
}