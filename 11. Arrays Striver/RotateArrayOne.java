import java.util.Scanner;

public class RotateArrayOne {
     
     public static void rarray(int arr[],int n){
          int temp= arr[0];
          for(int i=1;i<n;i++){
               arr[i-1]=arr[i];
          }
          arr[n-1]=temp;
     }

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          System.out.println("enter n:");
          int n=sc.nextInt();
          int arr[]= new int[n];
          for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
          }

          rarray(arr,n);
          // printing rotate array by one place
          System.out.println("rotate array by one place");
          for(int i=0;i<n;i++){
               System.out.print(arr[i]+" ");
          }
     }
}
