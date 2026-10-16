import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linked_HashSet {
    public static void main(String[] args) {
        HashSet<String> city = new HashSet<>(); 
        city.add("Kolkata"); 
        city.add("Delhi"); 
        city.add("Bengaluru"); 
        city.add("Mumbai"); 
        System.out.println("Hash Set are: "+city);

        LinkedHashSet<String> lsh = new LinkedHashSet<>(); //store uniqe property
        lsh.add("Kolkata"); 
        lsh.add("Delhi"); 
        lsh.add("Bengaluru"); 
        lsh.add("Noida"); 
        System.out.println("Linked HashSet are:"+lsh);

        //remove
        lsh.remove("Noida");
        System.out.println(lsh);
    }
}
