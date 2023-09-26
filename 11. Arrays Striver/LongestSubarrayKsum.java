public class LongestSubarrayKsum {
     
     // brute approach
     // static int subarray(int arr[],int d){
     //      int n=arr.length;
     //      int len = 0;
     //      for(int i=0;i<n;i++){  //tc >> O(N)
     //           for(int j=0;j<n;j++){//tc >> O(N)
     //                int sum =0;
     //                for(int k=i;k<=j;k++){//tc >> O(N)
     //                     sum+=arr[k];
     //                }
     //                if(sum==d){
     //                     len=Math.max(len, j-i+1);
     //                }
     //           }
     //      }
     //      return len;
     //      // tottal code complexity is O(n^3) 
     // }

     // below approach is also brute appraoch but tc is diff

     // static int subarray(int arr[], int k){
     //      int n=arr.length;
     //      int len = 0;
     //      for(int i=0;i<n;i++){   //tc >> O(N)
     //           int sum = 0;
     //           for(int j=0;j<n;j++){ //tc >> O(N)
     //                sum = sum + arr[j+1];
     //                if(sum == k){
     //                     len = Math.max(len, j-i+1);
     //                }
     //           }
     //      }
     //      return len;
     //      // total tc is O(n^2)
     // }



     // better approach
     static int subarray(int arr[],int k){
           int n = arr.length;
           for(int i=0;i<n;i++){
               for(int j=0;j<n;j++){
                    
               }
           }
     }
     public static void main(String[] args) {
          int arr[] = {2, 3, 5, 1, 9};
          int k = 10;
          System.out.println(subarray(arr,k));
     }
}
