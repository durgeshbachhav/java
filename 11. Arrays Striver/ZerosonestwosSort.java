import java.util.ArrayList;
import java.util.Arrays;

public class ZerosonestwosSort {

     // brute force approach using any sorting algorithm
     // tc>> O(nlogn) sc>>o(n)
     // it can be sorted but not in good condition it exist timing
     // static void sort(int arr[],int n){
     //      for(int i=n-1;i>=0;i--){
     //           for(int j=0;j<i-1;j++){
     //                if(arr[j]>arr[j+1]){
     //                     int temp = arr[i];
     //                     arr[i]=arr[j+1];
     //                     arr[j+1]=temp;
     //                }
     //           }
     //      }
     //  }



     // better solution 
     // tc>> O(nlogN) sc>>O(n)
     // static void sort(int arr[]){
     //      int n = arr.length;
     //      int cnt0=0;
     //      int cnt1=0;
     //      int cnt2=0;
     //      for(int i=0;i<n;i++){
     //           if(arr[i]==0) cnt0++;
     //           else if(arr[i]==1) cnt1++;
     //           else cnt2++;
     //      }
     //      for(int i=0;i<cnt0;i++){
     //           arr[i]=0;
     //      }
     //      for(int i=cnt0;i<cnt0+cnt1;i++){
     //           arr[i]=1;
     //      }
     //      for(int i=cnt0+cnt1;i<n;i++){
     //           arr[i]=2;
     //      }
     // }



     // optimal solution


     static void sort(ArrayList<Integer> arr,int n){

          int low =0,mid=0,high=n-1;
          while(mid<=high){
               if(arr.get(mid)==0){
                    int temp = arr.get(low);
                    arr.set(low, arr.get(mid));
                    arr.set(mid, temp);
                    low++;
                    mid++;

               } else if(arr.get(mid)==1){
                    mid++;
               } else{
                    int temp = arr.get(mid);
                    arr.set(mid, arr.get(high));
                    arr.set(high, temp);
                    high--;
               }
          }


     //      int low = 0, mid = 0, high = n - 1; // 3 pointers
     //    while (mid <= high) {
     //        if (arr.get(mid) == 0) {
     //            // swapping arr[low] and arr[mid]
     //            int temp = arr.get(low);
     //            arr.set(low, arr.get(mid));
     //            arr.set(mid, temp);
     //            low++;
     //            mid++;
     //        } else if (arr.get(mid) == 1) {
     //            mid++;
     //        } else {
     //            // swapping arr[mid] and arr[high]
     //            int temp = arr.get(mid);
     //            arr.set(mid, arr.get(high));
     //            arr.set(high, temp);
     //            high--;
     //        }
     //    }


     }
     public static void main(String[] args) {
          
          // bruete and better solution
          // int arr[]={0,1,2,0,1,2,1,2,0,0,0,1};     
          // int n= arr.length;
          // sort(arr,n);
          // for(int i=0;i<n;i++){
          //      System.out.print(arr[i]+" ");
          // }
          // optimal solution

          int n=6;
          ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[]{0,2,1,2,0,1}));
          sort(arr,n);
          for(int i=0;i<n;i++){
               System.out.print(arr.get(i)+" ");
          }
          System.out.println();
     }
}
