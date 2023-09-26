import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class LearnSet {
     public static void main(String[] args) {
          
          // Set<Integer> set = new HashSet<>();
          // Set<Integer> set = new LinkedHashSet<>();
          Set<Integer> set= new TreeSet<>(); 

          set.add(23);
          set.add(98);
          set.add(56);
          set.add(78);
          System.out.println("set : "+set);
          System.out.println("set : "+set.remove(56));
          System.out.println("set : "+set.contains(56));
          System.out.println("set : "+set);
          System.out.println("set : "+set.isEmpty());
          System.out.println("set : "+set.size());
          set.clear();
          System.out.println("set : "+set);
     }
}
