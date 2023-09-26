import java.util.HashSet;

public class FindMissingNum {
     

     // brute force solution approach
     // tc >> O(N * N) and sc >> O(1)
     // static int missingnum(int arr[]){
     //      int n = arr.length;
     //      for(int i=1;i<=n;i++){
     //           int flag = 0;
     //           for(int j=0;j<=n-1;j++){
     //                if(arr[j]==i){
     //                     flag = 1;
     //                     break;
     //                }
     //           }
     //           if(flag==0)
     //           return i;
     //      }
     //      return -1;
     // }


     // better solution approach
     // in this approach we using hashing technique 
     // just thinking about num of occrance if >1 is available else 0 so it is missing num

     static int missingNum(int arr[]){
          HashSet<Integer> hs = new HashSet<>();
          
          
     }



     public static void main(String[] args) {
          
          int arr[]={1,2,3,5};
          System.out.println(missingnum(arr));
     }
}
