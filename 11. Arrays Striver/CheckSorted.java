import javax.print.FlavorException;

public class CheckSorted {
     
     public static boolean isSorted(int arr[] ,int n){
          for(int i=1;i<n;i++){
               if(arr[i]>=arr[i-1]){
                    
               } else {
                    return false;
               }
          }
          return true;

     }

     public static void main(String[] args) {
          
          int arr[]={1,24536,131313};
          int n=arr.length;
          System.out.println("array is sorted? >> "+isSorted(arr,n));
     }
}
