public class Inheritance {
     
     public static void main(String[] args) {
          
     Horse h1 = new Horse();
     h1.breate();
     mammals m1 = new mammals();
     m1.hair();

     }
}
// base class
class Animal{
     String name;

     void eat(){
          System.out.println("they can eat");
     }
     void breate(){
          System.out.println("they can breath");
     }
     void hair(){
          System.out.println("they have hairs");
     }
}
class mammals extends Animal{
     void land(){
          System.out.println("it lives on land");
     }
}

class Horse extends Animal{
     void run(){
          System.out.println("horse run");
     }
     void legs(){
          System.out.println("4 legs");
     }
}
