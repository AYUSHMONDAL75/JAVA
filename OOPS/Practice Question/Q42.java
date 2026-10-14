// Q42: MathUtils static methods
class MathUtils {
    static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}

public class Q42 {
    public static void main(String[] args) {
        System.out.println("Factorial of 5 = " + MathUtils.factorial(5));
        System.out.println("GCD of 12 and 18 = " + MathUtils.gcd(12, 18));
        System.out.println("LCM of 12 and 18 = " + MathUtils.lcm(12, 18));
    }
}
