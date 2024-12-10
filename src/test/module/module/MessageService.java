package module;

public class MessageService {
    public static String[] create4Message(User user1, User user2, User user3, User user4) {
        String[] time = {"12:10", "13:45", "14:15", "17:59"};
        String[] data = {"25.01.2006", "31.05.2006", "25.05.1988", "07.02.2007"};
        String[] vivod = {time[0] + " " + user1.getNickname() + " " + " Привет!Скинь свой номер "  + data[0],
                          time[1] + " " + user2.getNickname() + " Привет. Вот: " + user1.getNumber() + " " + data[1],
                          time[2] + " " + user3.getNickname() + " Ребят, а как зовут 4 пользователя?" + " " + data[2],
                          time[3] + " " + user4.getNickname() + " Привет, я " + user3.getName() + " " + data[3]};
        return vivod;
    }
}



