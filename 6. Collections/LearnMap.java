import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
     
     public static void main(String[] args) {
          
          // Map<String, Integer> numbers= new HashMap<>();
          Map<String, Integer> numbers= new TreeMap<>();
          numbers.put("one", 1);
          numbers.put("two", 2);
          numbers.put("five", 3);
          // treemap
          numbers.remove("two");
          System.out.println(numbers);


          if(numbers.containsKey("two")){
               
               numbers.put("two", 22);
          }
          numbers.putIfAbsent("two", 23);
          System.out.println(numbers);
          for(Map.Entry<String , Integer> e: numbers.entrySet()){
               System.out.println(e);
               System.out.println(e.getKey());
               System.out.println(e.getValue());
          }
          for (String key:  numbers.keySet()){
               System.out.println(key);
          }
          // numbers.clear();
          System.out.println(numbers.isEmpty());
          System.out.println(numbers);
     }
}
