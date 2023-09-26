import java.util.Stack;

public class LearnStack {
     public static void main(String[] args) {
          
          Stack <String> animals = new Stack<>();
          
          animals.push("Lion");
          animals.push("cat");
          animals.push("dog");
          System.out.println("stack:"+animals);
          System.out.println(animals.peek());
          System.out.println(animals.pop());
          System.out.println(animals.peek());
     }
}
