import java.util.*;

public class Hasmap_Operation {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        //insert
        hm.put("india", 100);
        hm.put("Chaina", 50);
        hm.put("USA", 5);

        System.out.println(hm);

        //get
        int population = hm.get("india");
        System.out.println(population);

        //containts key
        System.out.println(hm.containsKey("india"));  //return true value
        System.out.println(hm.containsKey("Indronesia")); //return false

        //remove
        hm.remove("india"); //delete india
        System.out.println(hm.remove("indronesia"));  //return null value
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());
    }
    
}