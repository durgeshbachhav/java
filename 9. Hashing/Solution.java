
import java.util.Scanner;

public class Solution{

     public static void main(String[] args) {
        
          
          // hashing program to check appereance
          Scanner sc= new Scanner(System.in);
          System.out.println("how many numbers in array?");
          int n=sc.nextInt();
          System.out.println("enter numbers below");
          int[] arr=new int[n];
          for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
          }
          // here we precompute
          int hash[]=new int[13];
          for(int i=0;i<n;i++){
               hash[arr[i]]+=1;
          }

          System.out.println("how many  numbers to check apperance");
          int query= sc.nextInt();
          System.out.println("enter numbers below");
          while(query>=1){
               int numbers=sc.nextInt();
               query--;
               // it is fetching
               System.out.println("apperance time :" +hash[numbers]);
          }
          
     }
}