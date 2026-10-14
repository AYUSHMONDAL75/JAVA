// Q48: Logger with static log() used by unrelated classes
class Logger {
    static void log(String message) {
        System.out.println("[LOG] " + message);
    }
}

class Payment {
    void pay() {
        Logger.log("Payment done");
    }
}

class Login {
    void login() {
        Logger.log("User logged in");
    }
}

public class Q48 {
    public static void main(String[] args) {
        new Login().login();
        new Payment().pay();
        Logger.log("Program finished");
    }
}
