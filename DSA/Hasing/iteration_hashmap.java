import java.util.HashMap;
import java.util.Set;

public class iteration_hashmap {
  public static void main(String[] args) {
      HashMap<String, Integer> hm = new HashMap<>();

        //insert
        hm.put("india", 100);
        hm.put("Chaina", 50);
        hm.put("USA", 5);
        hm.put("Nepal", 5);

        //iterate
        Set<String> keys = hm.keySet(); //loop  on keyset
        System.out.println(keys);
        
        for (String k : keys) {
            System.out.println("key: "+k+ ", Value: " + hm.get(k));
        }
  }  
}