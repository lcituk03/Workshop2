package pl.coderslab;


import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class MainDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        //sprawdzenie create
//        User user = new User();
//        user.setUserName("arek");
//        user.setEmail("arkadiusz2.jozwiak@coderslab.pl");
//        user.setPassword("pass");
//        userDao.create(user);
//        User user2 = new User();
//        user2.setUserName("ala");
//        user2.setEmail("ala.jozwiak@coderslab.pl");
//        user2.setPassword("pass2");
//        userDao.create(user);

        //sprawdzenie update i read
//        User userToUpdate = userDao.read(2);
//        System.out.println(userToUpdate);
//        userToUpdate.setUserName("Jan");
//        userToUpdate.setEmail("jan@coderslab.pl");
//        userToUpdate.setPassword("superPassword");
//        System.out.println(userToUpdate);
//        userDao.update(userToUpdate);

        //sprawdzenie delete i listy uzytkownikow
//        userDao.delete(4);
//        User[] all = userDao.findAll();
//        for (User u : all) {
//            System.out.println(u);
//        }

    }
}