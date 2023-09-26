import java.util.jar.Attributes.Name;

public class Example2 {
     static int count = 0;
     public static void username(){
          if(count == 5) return;
          System.out.println("durgesh");
          count++;
          username();
     }
     public static void main(String[] args) {
          String name= "durgesh";
          username();
          
     }
}
