// Q45: Static block runs once when the class is loaded
class Config {
    static String appName;
    static int maxUsers;

    static {
        System.out.println("Static block running...");
        appName = "MyApp";
        maxUsers = 100;
    }
}

public class Q45 {
    public static void main(String[] args) {
        System.out.println("Main started");
        System.out.println("App name = " + Config.appName);   // class loads here
        System.out.println("Max users = " + Config.maxUsers);
    }
}
