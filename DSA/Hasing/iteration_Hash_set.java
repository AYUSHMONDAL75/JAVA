import java.util.HashSet;
import java.util.Iterator;

public class iteration_Hash_set { 
    public static void main(String[] args) { 
        HashSet<String> city = new HashSet<>(); 
        city.add("Kolkata"); 
        city.add("Delhi"); 
        city.add("Bengaluru"); 
        city.add("Mumbai"); 
        
        Iterator<String> it = city.iterator(); 
        
        while(it.hasNext()){ 
            System.out.println(it.next()); 
        }
    } 
}
