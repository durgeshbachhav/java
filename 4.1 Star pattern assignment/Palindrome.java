public class Palindrome {
     // check number is palindrome or not
     public static boolean palindrome(int n) {
          String oringinal = String.valueOf(n);
          String dublicate = new StringBuilder(oringinal).reverse().toString();
          return oringinal.equals(dublicate);
     }
     public static void main(String[] args) {
          int n=234;
          System.out.println(n+" is palindrome : "+palindrome(n));
     }
}
