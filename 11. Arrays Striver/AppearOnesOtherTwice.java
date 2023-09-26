public class AppearOnesOtherTwice {


     //brute approach incomplete
     // static void onceOccurance(int arr[]){
     //      int n = arr.length;
     //      for(int i=0;i<n;i++){
     //           int num = arr[i];
     //           int count = 0;
     //           for(int j=0;j<n;j++){
     //                if(arr[i]==0){
     //                     if(arr[j]==num){
     //                          count++;
     //                     }
     //                }
     //                if(count==1){
     //                     System.out.println(num);
     //                }
     //           }
     //      }
     // }
     

     // better approach incomplete

     // optimal approach 
     static int optimal(int arr[]){
          int xor= 0; 
          for(int i=0;i<arr.length;i++){
               xor = xor ^ arr[i];
          }
          return xor;
     }
     public static void main(String[] args) {
          
          int arr[] = { 1,1,2,3,3,4,4,5,5};
          System.out.println(optimal(arr));
     }
}
