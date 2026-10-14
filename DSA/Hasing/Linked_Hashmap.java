import java.util.LinkedHashMap;

public class Linked_Hashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        
        //insert
        lhm.put("india", 100);
        lhm.put("Chaina", 50);
        lhm.put("USA", 5);  
        
        System.out.println(lhm);
    }
}
