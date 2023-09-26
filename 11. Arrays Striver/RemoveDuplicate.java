import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
     
     public static void removeDup(int arr[], int n){
          Set <Integer> uniqueset = new HashSet<Integer>();
          for(int i=0;i<n;i++){
               uniqueset.add(arr[i]);
          }
     }

     public static void main(String[] args) {
          
          int arr[]={ 1,1,2,2,2,3,3};
          int n= arr.length;
          removeDup(arr,n);
          for(int i=0;i<n;i++){
               System.out.print(arr[i]+" ");
          }
     }
}
