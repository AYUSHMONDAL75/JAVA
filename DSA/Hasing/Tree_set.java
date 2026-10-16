import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Tree_set {
    public static void main(String[] args) {
        //HashSet
        HashSet<String> city = new HashSet<>(); 
        city.add("Kolkata"); 
        city.add("Delhi"); 
        city.add("Bengaluru"); 
        city.add("Mumbai"); 
        System.out.println("HashSet are: " + city);

        //Linked HashSet
        LinkedHashSet<String> lsh = new LinkedHashSet<>(); //store uniqe property
        lsh.add("Kolkata");
        lsh.add("Delhi");
        lsh.add("Bengaluru");
        lsh.add("Noida");
        System.out.println("Linked HashSet are:" + lsh);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Kolkata");
        ts.add("Delhi");
        ts.add("Bengaluru");
        ts.add("Noida");
        System.out.println("TreeSet are:"+ts);
    }
}