package module;

public class Main {
    public static void main(String args[]) {
        //Массив данных о пользователях
        User[] listUsers = UserService.create4Users();
        //Массив данных о сообщении
        String[] message = MessageService.create4Message(listUsers[0], listUsers[1], listUsers[2], listUsers[3]);

        //Вывод информации о пользователях
        for (int i = 0; i < listUsers.length; i++) {
            System.out.println("UserData: ");
            System.out.println("Nickname: " + listUsers[i].getNickname());
            System.out.println("Name: " + listUsers[i].getName());
            System.out.println("Number: " + listUsers[i].getNumber());
            System.out.println("Password: " + listUsers[i].getPassword() + "\n");
        }

        System.out.println();
        System.out.println("Chat: ");
        //Вывод сообщений
        for (int i = 0; i < message.length; i++) {
            System.out.println(message[i]);
        }
    }
}