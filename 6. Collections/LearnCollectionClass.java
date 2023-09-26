import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class LearnCollectionClass {
     public static void main(String[] args) {
          
          List<Integer> ls = new ArrayList<>();
          ls.add(4);
          ls.add(14);
          ls.add(23);
          ls.add(4);
          ls.add(4);
          ls.add(3);
          System.out.println(ls);
          System.out.println(Collections.min(ls));
          System.out.println(Collections.frequency(ls,4));
     }
}
