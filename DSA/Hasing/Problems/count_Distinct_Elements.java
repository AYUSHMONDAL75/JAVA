import java.util.HashSet;

public class count_Distinct_Elements {
    public static void main(String[] args) {
        int num[] = {4, 3, 2, 5,6, 7, 3, 4, 2, 1};
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < num.length; i++){  //0(n)
            set.add(num[i]);
        }

        System.out.println("ans: "+ set.size());
    }
}