// Q17: PrimeChecker
class PrimeChecker {
    boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

public class Q17 {
    public static void main(String[] args) {
        PrimeChecker p = new PrimeChecker();
        int[] numbers = { 1, 2, 17, 20, 29 };
        for (int n : numbers) {
            System.out.println(n + (p.isPrime(n) ? " is prime" : " is not prime"));
        }
    }
}
