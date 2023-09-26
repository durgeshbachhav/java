public class Sum {
     public static int sumfunction(int a) {
          String numStr = String.valueOf(a);
          int sum=0;
          for(int i=0;i<numStr.length();i++){
               int digit = Character.getNumericValue(numStr.charAt(i));
               sum=sum+digit;
          }
          return sum;
     }
     public static void main(String[] args) {
          System.out.println("the sum of the number is : "+sumfunction(9658462));
     }
}
