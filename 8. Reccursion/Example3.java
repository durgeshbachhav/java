
public class Example3 {
     
     public static void username(int i,int n){
          if(i<1) return;
          System.out.print(i +" ");
          username(i-1, n);
          
     }
     public static void main(String[] args) {
          int n=10;
          username(n,n);
          
     }
}
