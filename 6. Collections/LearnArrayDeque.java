import java.util.ArrayDeque;
import java.util.ArrayDeque;

public class LearnArrayDeque {
     public static void main(String[] args) {
          
          ArrayDeque<Integer> ad = new ArrayDeque<>();

          ad.offer(24);
          ad.offerFirst(78);
          ad.offerLast(45);
          ad.offerFirst(90);
          System.out.println(ad);
          System.out.println("peek :"+ad.peek());
          System.out.println("peek first :"+ ad.peekFirst());
          System.out.println("peek last :"+ ad.peekLast());
          System.out.println("poll :"+ ad.poll());
          System.out.println("poll first :"+ ad.pollFirst());
          System.out.println("poll last :"+ ad.pollLast());
          System.out.println("ad :"+ ad);
     }
}
