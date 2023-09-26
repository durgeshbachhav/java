import java.util.Scanner;

public class Linearsearch {

     public static int linear(int arr[], int key){
          int n= arr.length;
          for(int i=0;i<n;i++){
               if(arr[i]==key){
                    return i;
               }
               
          }
          // System.out.println("key found at index :"+index);
          return -1;
     }
     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          System.out.println("enter n");
          int n = sc.nextInt();
          int arr[]=new int[n];
          for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
          }
          System.out.println("enter key");
          int key = sc.nextInt();
          System.out.println(linear(arr,key));
     }
}
