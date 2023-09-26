public class Example1{
     static int count =0;
     public static void myfun(int n) {
          if(count == n) return;
          System.out.println(count);
          count++;
          myfun(count);
     }
     public static void main(String[] args) {
          int n = 10;
          myfun(n);
     }
}