import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UnionOfTwo {

     // brute force solution approach
     
     // static ArrayList<Integer> Findunion(int arr1[],int arr2[]){
     //      HashMap<Integer,Integer> frequency = new HashMap<>();
     //      ArrayList<Integer> union = new ArrayList<>();
     //      int n1= arr1.length;
     //      int n2= arr2.length;
     //      for(int i=0;i<n1;i++){
     //           frequency.put(arr1[i], frequency.getOrDefault(arr1[i], 0)+1);
     //      }
     //      for(int i=0;i<n2;i++){
     //           frequency.put(arr2[i], frequency.getOrDefault(arr2[i], 0)+1);
     //      }
     //     for(int val: frequency.keySet()){
     //           union.add(val);
     //      }
     //      return union;

     // }

     // optimal solution approach but using set 
     // static ArrayList<Integer> Findunion(int arr1[],int arr2[]){
     //      int n1 = arr1.length;
     //      int n2 = arr2.length;
     //      HashSet <Integer> set = new HashSet<>();
     //      ArrayList<Integer> union = new ArrayList<>();
     //      for(int i=0;i<n1;i++){
     //           set.add(arr1[i]);
     //      }
     //      for(int i=0;i<n2;i++){
     //           set.add(arr2[i]);
     //      }
     //      for(int it:set){
     //           union.add(it);
     //      }
     //      return union;
     // }


     static ArrayList<Integer> Findunion(int arr1[], int arr2[]){

          int n1 = arr1.length;
          int n2 = arr2.length;
          ArrayList<Integer> union = new ArrayList<>();
          int i=0;
          int j=0;
          while(i < n1 && j < n2){
               if(arr1[i] <= arr2[j]){
                                                  // check previos value is same or not
                    if(union.size() == 0 || union.get(union.size()-1)!=arr1[i]){
                         union.add(arr1[i]);
                    }
                    i++;
               } else {
                    if(union.size() == 0 || union.get(union.size()-1)!=arr2[j]){
                         union.add(arr2[j]);
                    }
                    j++;
               }
          }
          // check previos value is same or not
          while(i<n1){
               if(union.get(union.size()-1)!= arr1[i])
               union.add(arr1[i]);
               i++;
          }// check previos value is same or not
          while(j<n2){
               if(union.get(union.size()-1)!= arr2[j])
               union.add(arr2[j]);
               j++;
          }


          return union;
     }
     public static void main(String[] args) {
          // array is sorted
          int arr1[]={1,1,2,3,4,5,5,6,7};
          int arr2[]={1,1,2,3,3,4,4,5,5,6,7,8,9,10,11,12};
          ArrayList<Integer> union=Findunion(arr1,arr2);
          System.out.println("union of arr1 and arr2 is : ");
          for(int it:union){
               System.out.print(it+" ");
          }
     }
}
