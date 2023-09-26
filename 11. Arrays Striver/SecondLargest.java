import java.util.Arrays;
import java.util.Scanner;
// Bruete force approach
public class SecondLargest {
     
     // we find secondlargest as well as secondsmallest
     public static void SecondLargest(int arr[], int n){
          if(n==0 || n==1){
               System.out.print("-1");
               System.out.print(" ");
               System.out.print("-1");
               System.out.print(" ");
          } 
          Arrays.sort(arr);
          // this approach is wrong
          // int small =arr[1];
          // int large = arr[n-2];
          // System.out.println("second smallest element is : "+small);
          // System.out.println("second largest element is : "+large);
          for(int i=n-2;i>=0;i--){
               if(arr[i]!=arr[n-1]){
                    int element = arr[i];
                    System.out.println("secondlargest : "+element);
                    break;
               }
          }
     }
     

     public static void main(String[] args) {
          
          int[] arr = { 1,4,6,2,4,45,23,23};
          int n = arr.length;
          SecondLargest(arr,n);

     }
}
