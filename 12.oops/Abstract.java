public class Abstract {
     public static void main(String[] args) {
          

          Horse h1 = new Horse();
          h1.eat();
          h1.run();

     }
}

abstract class Animal{
      abstract void eat();

      void run(){
          System.out.println("they can run");
      }
}
class Horse extends Animal{
     void eat(){
          System.out.println("they can eat");
     }
}

class Chicken extends Animal{
     void eat(){
          System.out.println("they can grains");
     }

     
     void egg(){
          System.out.println("chicken can produce egg");
     }
}
