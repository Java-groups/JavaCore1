package arthurmkrtchian.javaCore.HW10.StringRegex.practicalTasks.practicalTask3;

//        The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
//        Using regular expressions implement checking the user name for validity. Input five names in
//        the main method . Output a message to the console of the validation of each of the entered
//        names.

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<User> users = fillList();
        for (User user: users){
            System.out.println(user.getUserName());
        }
    }

    static List<User> fillList(){
        List<User> users = new ArrayList<>();
        addUser(users, "user_name");
        //less than 3 chars
        addUser(users, "us");
        addUser(users, "user%");
        //more than 15 chars
        addUser(users, "user_user_senior");
        addUser(users, "user1224_34");
        return users;
    }

    static void addUser(List<User> users, String userName){
        try{
            users.add(new User(userName));
            System.out.printf("The username \"%s\" is valid.", users.get(users.size()-1));
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}
