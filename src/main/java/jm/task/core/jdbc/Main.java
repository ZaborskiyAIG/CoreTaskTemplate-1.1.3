package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
      UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Имя", "Фамилия", (byte) 20);
        System.out.println("User с именем – Имя добавлен в базу данных");

        userService.saveUser("Имя1", "Фамилия1", (byte) 21);
        System.out.println("User с именем – Имя1 добавлен в базу данных");

        userService.saveUser("Имя2", "Фамилия2", (byte) 22);
        System.out.println("User с именем – Имя2 добавлен в базу данных");

        userService.saveUser("Имя3", "Фамилия3", (byte) 23);
        System.out.println("User с именем – Имя3 добавлен в базу данных");

        List<User> users = userService.getAllUsers();

        for (User user: users) {
            System.out.println(user.toString());
        }

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
