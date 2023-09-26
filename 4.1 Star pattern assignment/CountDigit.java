public class CountDigit {
     static int count_digit(int n){
          int x=n;
          int count =0;
          while(x!=0){
               x=x/10;
               count++;
          }
          return count;
     }
     public static void main(String[] args) {
          System.out.println("how many digits in number: "+count_digit(12345));
     }
}
