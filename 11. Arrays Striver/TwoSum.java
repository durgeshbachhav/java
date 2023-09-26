import java.util.HashMap;

public class TwoSum {

     // brute force approach
     // static int[] IsSumOfTwo(int arr[],int n,int target){
     //      int temparray[] = new int[2];
     //      temparray[0]=temparray[1]=-1;
     //      for(int i=0;i<n;i++){
     //           for(int j=i+1;j<n;j++){
     //                if(arr[i]+arr[j]==target) {
     //                     temparray[0]=i;
     //                     temparray[1]=j;
     //                     // return "yes";
     //                }
     //           }
     //      }
     //      // return "NO";
     //      return temparray;
     // }
     

     // better solution approach using hashing
     // static String twosumbetter(int arr[],int n , int target){
     //      HashMap<Integer,Integer> hm = new HashMap<>();
     //      for(int i=0;i<n;i++){
     //           int x = arr[i];
     //           int more = target - x;
     //           if(hm.containsKey(more)){
     //                return "Yes";
     //           }
     //           hm.put(arr[i], i);
     //      }
     //      return "NO";
     // }

     // varient 2

     // static int[] twosumbetter(int arr[],int n,int target){

     //      int temp[]= new int[2];
     //      temp[0]=temp[1]=-1;
     //      HashMap<Integer,Integer> hm = new HashMap<>();
     //      for(int i=0;i<n;i++){
     //           int x = arr[i];
     //           int findinmap = target - x;
     //           if(hm.containsKey(findinmap)){
     //                temp[0]=hm.get(findinmap);
     //                temp[1]=i;
     //                return temp;
     //           }
     //           hm.put(arr[i], i);
     //      }
     //      return temp;
     // }

     // optimal solution

     
     public static void main(String[] args) {
          
          int arr[]= {2,6,5,8,11};
          int target = 7;
          int n= arr.length;
          int[] ans = twosumbetter(arr, n,target);
          System.out.println(" index is : ["+ ans[0]+","+ans[1]+"]");

     }
}
