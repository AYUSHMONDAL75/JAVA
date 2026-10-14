// Q29: Validator with overloaded isValid()
class Validator {
    boolean isValid(String email) {
        return email.contains("@") && email.contains(".");
    }

    boolean isValid(long phone) {
        String s = String.valueOf(phone);
        return s.length() == 10;
    }
}

public class Q29 {
    public static void main(String[] args) {
        Validator v = new Validator();
        System.out.println("amit@gmail.com valid? " + v.isValid("amit@gmail.com"));
        System.out.println("amit.com valid? " + v.isValid("amit.com"));
        System.out.println("9876543210 valid? " + v.isValid(9876543210L));
        System.out.println("12345 valid? " + v.isValid(12345L));
    }
}
