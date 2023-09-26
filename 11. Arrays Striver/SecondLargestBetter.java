public class SecondLargestBetter {


     // using better solution approach
     // we find the solution without sorting
     // tc is big oh of N 
     // we do tow linear traversal in our array
     public static void SecondLargest(int arr[], int n){ 
          if(n==0 || n==1){
               System.out.print("-1");
               System.out.print(" ");
               System.out.print("-1");
               System.out.print(" ");
          } else {

               int large= Integer.MIN_VALUE;
               int secondlarge = Integer.MIN_VALUE;
               int small = Integer.MAX_VALUE;
               int secondsmall = Integer.MAX_VALUE;

               for(int i=0;i<n;i++){
                    small = Math.min(small, arr[i]);
                    large = Math.max(large, arr[i]);
               }
               for(int i=0;i<n;i++){
                    if(arr[i] < secondsmall && arr[i]!= small){
                         secondsmall=arr[i];
                    }
                    if(arr[i] > secondlarge && arr[i]!= large){
                         secondlarge=arr[i];
                    }
               }
               System.out.println("second largest element in array is : "+secondlarge);
               System.out.println("second smallest element in array is : "+secondsmall);
          }
     }
     

     public static void main(String[] args) {
          
          int arr[] = {34,3,64,2,5,6,9,6,3,56,8};
          int n= arr.length;
          SecondLargest(arr,n);
     }
}
