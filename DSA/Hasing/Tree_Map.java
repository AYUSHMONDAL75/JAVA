import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();

        //insert
        tm.put("India", 100);
        tm.put("Chaina", 150);
        tm.put("USA", 50);

        System.out.println(tm);  //based on the key sorting
    }
}
