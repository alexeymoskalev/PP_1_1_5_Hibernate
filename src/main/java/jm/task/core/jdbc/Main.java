package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Alexey", "Moskalev", (byte) 29);
        userService.saveUser("Ivan","Ivanov", (byte) 18);
        userService.saveUser("Petr", "Petrov", (byte) 33);
        userService.saveUser("Viktor","Korneplod", (byte) 67);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
    }

