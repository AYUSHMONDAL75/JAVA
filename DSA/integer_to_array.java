
import java.util.Arrays;
import java.util.Scanner;

public class integer_to_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        String str = String.valueOf(num);
        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
