// Q12: StringProcessor - reverse, count vowels, palindrome
class StringProcessor {
    String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    int countVowels(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    boolean isPalindrome(String s) {
        return s.equalsIgnoreCase(reverse(s));
    }
}

public class Q12 {
    public static void main(String[] args) {
        StringProcessor sp = new StringProcessor();
        String text = "Madam";
        System.out.println("Reverse: " + sp.reverse(text));
        System.out.println("Vowels: " + sp.countVowels(text));
        System.out.println("Palindrome? " + sp.isPalindrome(text));
    }
}
