package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    private static final UserService userService = new UserServiceImpl();
    public static void main(String[] args)  throws SQLException {

        userService.createUsersTable();
        userService.saveUser("Alexey", "Moskalev", (byte) 29);
        userService.saveUser("Ivan","Ivanov", (byte) 18);
        userService.saveUser("Petr", "Petrov", (byte) 33);
        userService.saveUser("Viktor","Korneplod", (byte) 67);
        userService.removeUserById(2);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
    }

