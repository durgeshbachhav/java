import java.util.Scanner;

import javax.swing.undo.StateEdit;

// maximum length of array in inside main is 10^6 and globally is 10^7
// array can be store in memory location n memory address and it is contigious memory location

// example 1 = largest element in the array
// there are some solution type like bruete force >> better >> optimization sometime it has different space and time complexities

// arr [3,2,1,5,2]
// approach 1 >> loop from 1 to n-1 ,initialize the min = integer.minvalue , and chech condition min<arr[i] if true then min = arr[i]
// approach 2 >> sort array and we get last element this last element is our gretest number of given array
// approach 3 >>



//  example 2 = find 2 nd largest element or 2nd smallest element in array without sorting





public class Basic{

     // firstly we use bruete force approach
     public static int brueteForLarge(int arr[],int n){
          int largest= arr[0];

          // time complexity is  big oh of N
          for(int i=0;i<n;i++){
               if(arr[i] > largest){
                   largest = arr[i];
               }
          }
          return largest;
     }

     public static int secondLargest(int arr[],int n){
          int secondlarge = arr[0];
          for(int i=0;i<n;i++){
               if(arr[i] > secondlarge){
                    secondlarge = arr[i];
               }
          }
     }

     public static void main(String[] args) {
          
          Scanner sc= new Scanner(System.in);
          System.out.println("enter n: ");
          int n= sc.nextInt();
          int arr[] = new int[n];
          for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
          }
          System.out.println();
          
          System.out.println("largest number is : " +brueteForLarge(arr, n));
          
     }
}