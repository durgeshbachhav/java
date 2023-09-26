public class Solution {
     public static void main(String args[]) {
       int a =10, b= 34;
       int ans = 1;
       for(int i=0;i<=Math.min(a,b);i++){
          if(a%i==0 && b%i==0){
               ans = i;
          }
       }
       System.out.print("The GCD of the two number is "+ans);
     }
   }