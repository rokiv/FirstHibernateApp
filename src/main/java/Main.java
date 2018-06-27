import models.Auto;
import models.User;
import services.UserService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();
        User user = new User("Pasha",29);
        userService.saveUser(user);
        Auto auto1 = new Auto("ferrari","black");
        user.addAuto(auto1);
        Auto auto2= new Auto("VAZ","baklazhan");
        user.addAuto(auto2);
        userService.updateUser(user);

        List<User> list = userService.findAllUsers();
        for (User u: list
             ) {
            System.out.println(u);
        }

    }
}
