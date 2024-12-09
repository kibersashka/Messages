package module;

public class User {
    private String nickname;
    private String name;
    private String number;
    private String password;

    public User() {}

    public User(String nickname, String name, String number, String password) {
        this.nickname = nickname;
        this.name = name;
        this.number = number;
        this.password = password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(SgetNickname()tring number) {
        this.number = number;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getPassword() {
        return password;
    }
}