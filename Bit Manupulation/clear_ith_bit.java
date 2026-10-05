public class clear_ith_bit {
    public static int getIthBit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10, 1));
    }
}