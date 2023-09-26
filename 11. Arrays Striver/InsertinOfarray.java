import java.util.ArrayList;

public class InsertinOfarray {

// brute force solution
// tc >> O(n1 * n2) and sc >> O(2N)
     // static ArrayList<Integer> FindIntersection(int[]a,int[]b){
     //      ArrayList<Integer> intersection = new ArrayList<>();

     //      int visited[] = new int[b.length];

     //      for(int i=0;i<a.length;i++){
     //           for(int j=0;j<b.length;j++){
     //                if(a[i]==b[j] && visited[j]==0){
     //                     intersection.add(a[i]);
     //                     visited[j]=i;
     //                     break;
     //                }
     //                if(b[j]>a[i])
     //                break;
     //           }
     //      }
     //      return intersection;
     // }



     // optimal solution
// tc >> O(n1 + n2)  and sc >> O(1)
     static ArrayList<Integer> FindIntersection(int a[], int b[]){
          ArrayList<Integer> intersection = new ArrayList<>();

          int n1 = a.length;
          int n2 = b.length;
          int i=0, j=0;
          while(i < n1 && j < n2){
               if(a[i] < b[j]){
                    i++;
               } else if(b[j]< a[i]){
                    j++;
               } else {
                    intersection.add(a[i]);
                    i++;
                    j++;
               }
          }

          return intersection;
     }
     public static void main(String[] args) {
          
          int a[]={1,2,3,4,4,5,6,7};
          int b[]={1,1,2,2,3,4,4,5,6,7};

          ArrayList<Integer> intersection = FindIntersection(a,b);
          for (int i = 0; i < intersection.size(); i++) {
               System.out.print(intersection.get(i)+" ");
             }
     }
}
