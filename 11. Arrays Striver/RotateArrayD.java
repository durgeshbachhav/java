import java.util.*;

public class RotateArrayD {
     // brute force approach
     public static void rarray(int arr[],int n,int d){
          d=d%n;
          int[] temp=new int[d];
          // add temprary array
          for(int i=0;i<d;i++){
               temp[i]=arr[i];
          }
          // shifting remaining array 
          for(int i=d;i<n;i++){
               arr[i-d]=arr[i];
          }
          for(int i=n-d;i<n;i++){
               arr[i]=temp[i-(n-d)];
          }
          
     }


     // optimal approach
     // we use reverse function for this approach
     public static void reverse(int arr[] ,int start ,int end){
          while(start <=end){
               int temp = arr[start];
               arr[start]=arr[end];
               arr[end]=temp;
               start++;
               end--;
          }
     }
     public static void rarray1(int arr[],int n, int d){
          if(n==0) return;
          d=d%n;

          // making temp array directly in reverse form
          reverse(arr, 0, d-1);

          // making remaining array in reverse form
          reverse(arr, d, n-1);

          // making reverse entire array for our solution
          reverse(arr, 0, n-1);

     }
     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          System.out.println("enter n:");
          int n=sc.nextInt();
          int arr[]= new int[n];
          for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
          }
          System.out.println("enter d:");
          int d=sc.nextInt();
          rarray1(arr,n,d);
          // printing rotate array by one place
          System.out.println("rotate array by "+d+" place");
          for(int i=0;i<n;i++){
               System.out.print(arr[i]+" ");
          }
     }
}
