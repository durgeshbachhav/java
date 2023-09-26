public class Polymorphism {

     
     public static void main(String[] args) {
          Calculator c1 = new Calculator();
          System.out.println(c1.sum(1.5,9.7));
          
     }
}

class Calculator{
     int sum(int a, int b){
          return a+b;
     }
     int sum(int a,int b, int c){
          return a+b+c;
     }
     double sum(double a,double b){
          return a+b;
     }
}


