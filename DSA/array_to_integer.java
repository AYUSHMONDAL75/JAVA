import java.util.Scanner;

public class array_to_integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enetr array Elemets: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int num = 0;

        for (int i = 0; i < n; i++) {
            num = num * 10 + arr[i];
        }

        System.out.println("Integer: " + num);
        sc.close();
    }
}