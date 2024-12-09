package module;
public class UserService {
    public static User[] create4Users() {
        User[] users = new User[4];
        users[0] = new User("qwverh", "Artem", "77777777777", "123456789");
        users[1] = new User("strayosz", "Kamil", "77777777777", "987654321");
        users[2] = new User("kibersashka", "Aleksandra", "77777777777", "192837465");
        users[3] = new User("asdfasf", "AKA", "77777777777", "918273645");
        return users;
    }
}