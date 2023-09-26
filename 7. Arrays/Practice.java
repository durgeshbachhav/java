import java.util.Scanner;

public class Practice {
     

     public static int LinearSearch(int arr[],int key){

          for(int i=0;i<arr.length;i++){
               if(arr[i]==key){
                    return i;
               }
          }
          return -1;
     }

     public static int BinarySearch(int arr[],int key){
          int start = arr[0];
          int end = arr.length;
          int mid = start + end /2;
          for(int i=0;i<arr.length;i++){
              if(mid  == key){
               return i;
              }
              if(mid > key){
               start = mid + 1;
              } else {
               end = mid - 1;
              }
          }
          return mid;
          
     }

     public static void ReverseArray(int arr[]){
          for(int i=0;i<arr.length;i++){
               int temp = arr[i];
               arr[i]= arr[arr.length-1];
               arr[arr.length-1]=temp;
               System.out.print(arr[i]+" ");
          }   
     }

     public static void PairInArray(int arr[]){
          for(int i=0;i<arr.length;i++){
               for(int j=i+1;j<arr.length;j++){
                    System.out.println("("+arr[i]+","+arr[j]+")");
               }
               System.out.println();
          }
     }

     public stat
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter how many array: ");
          int n = sc.nextInt();
          System.out.println("enter array elements: ");
          int arr [] = new int[n];
          for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
          }
          // System.out.println("enter key which you want to find?");
          // int key= sc.nextInt();
          // int index = LinearSearch(arr, key);
          // int indexbinary= BinarySearch(arr,key);
          // System.out.println("index is of "+key+" is "+indexbinary);
          PairInArray(arr);

     }
}
