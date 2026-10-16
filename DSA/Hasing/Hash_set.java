import java.util.HashSet;

public class Hash_set {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(2);
        hs.add(1);
        hs.add(3);

        System.out.println(hs);

        if(hs.contains(2)){
            System.out.println("Set contains 2");
        }if(hs.contains(3)){
            System.out.println("Set contains 3");
        }

        //size of set
        System.out.println(hs.size());
    }
}