package arthurmkrtchian.javaCore.HW10.stringRegex.practicalTasks.practicalTask3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private final String userName;
    static final String userNamePattern = "([a-zA-Z0-9_]){3,15}";

    public User(String userName) {
        Matcher m = Pattern.compile(userNamePattern).matcher(userName);
        if(!m.matches()){
            throw new IllegalArgumentException("\n\nInvalid user name. Please check conditions.\n" +
                    "The user name can contain only characters of the Latin alphabet, numbers, and underscores.\n" +
                    "It can`t contain less than 3 and more than 15 characters\n");
        }
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User Name is: " + userName;
    }

    public String getUserName() {
        return userName;
    }

}
