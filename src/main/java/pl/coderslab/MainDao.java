package pl.coderslab;


import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.util.Arrays;

public class MainDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        //sprawdzenie create
//        User user = new User();
//        user.setUserName("aga");
//        user.setEmail("aga.jozk@coderslab.pl");
//        user.setPassword("pas29357s");
//        userDao.create(user);
//        User user2 = new User();
//        user2.setUserName("antek");
//        user2.setEmail("antek.jozwiak@coderslab.pl");
//        user2.setPassword("pas8349r");
//        userDao.create(user2);

        //sprawdzenie update i read
//        User userToUpdate = userDao.read(2);
//        System.out.println(userToUpdate);
//        userToUpdate.setUserName("Janek");
//        userToUpdate.setEmail("jan@coderslab.pl");
//        userToUpdate.setPassword("superextraPassword");
//        userDao.update(userToUpdate);

        //sprawdzenie delete i listy uzytkownikow
//        User[] all = userDao.findAll();
//        for (User u : all) {
//            System.out.println(u);
//        }
//        userDao.delete(9);

//        System.out.println("------------------------");
//        all = userDao.findAll();
//        for (User u : all) {
//            System.out.println(u);
//        }

    }
}