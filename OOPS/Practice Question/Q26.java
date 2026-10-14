// Q26: Search with overloaded search()
class Search {
    int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    int search(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) return i;
        }
        return -1;
    }
}

public class Q26 {
    public static void main(String[] args) {
        Search s = new Search();
        int[] nums = { 10, 20, 30, 40 };
        String[] names = { "Amit", "Riya", "John" };
        System.out.println("30 found at index: " + s.search(nums, 30));
        System.out.println("Riya found at index: " + s.search(names, "Riya"));
        System.out.println("99 found at index: " + s.search(nums, 99));
    }
}
