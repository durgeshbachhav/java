import java.util.ArrayList;
import java.util.Scanner;

public class Selection{


     public static void SelectionSort(int arr[], int n){


          for(int i=0;i<=n-2;i++){
               int min=i;
               for(int j=i;j<=n-1;j++){
                    if(arr[j]<arr[min]){
                         min=j;
                    }
               }
               int temp = arr[min];
               arr[min] = arr[i];
               arr[i]= temp;
          }
         
     }

     public static void BubbleSort(int arr[],int n){

          for(int i=n-1;i>=0;i--){
               for(int j=0;j<=i-1;j++){
                    if(arr[j] > arr[j+1]){
                         int temp = arr[j+1];
                         arr[j+1]=arr[j];
                         arr[j]=temp;
                    }
               }
          }
     }

     public static void InsertionSort(int arr[],int n){
          for(int i=0;i<=n-1;i++){
               int j=i;
               while((j>0 && j>=arr[j-1])){
                    int temp =arr[i];
                    arr[i] = arr[j+1];
                    arr[j+1]=temp;
                    j--;
               }
          }
     }

     public static void MergeSort(int arr[],int low , int high){
          int left = arr[0];
          int right = arr.length;
          
          for(int i=0;i<arr.length;i++){
               if(left >= right){
                    return ;
               }
               int mid = (left + right )/2;
               MergeSort(arr, left, mid);
               MergeSort(arr, mid+1, high);
               MergeSort(arr, left, high);
          }
     }

     public static void SelectionSort1(int arr[], int n){
          for(int i=0;i<=n-2;i++){
               int min = i;
               for(int j=i;j<=n-1;j++){
                    if(arr[j]<arr[min]){
                         min = j;
                    }
               }
               int temp = arr[min];
               arr[min]=arr[i];
               arr[i]=temp;
          }
     }

     public static void BubbleSort1(int arr[], int n){
          for(int i=n-1;i>=0;i--){
               for(int j=0;j<=i-1;j++){
                    if(arr[j]>arr[j+1]){
                         int temp = arr[j];
                          arr[j]=arr[j+1];
                          arr[j+1] =temp;
                    }
               }
          }
     }

     
     public static void InsertionSort1(int arr[], int n){
          
          for(int i=1;i<=n-1;i++){
               for(int j=1;j>0 && arr[j-i] > arr[j];j++){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= temp;
               }
          }
     }
     
     
     public static void MergeSort1(int arr[],int low , int high){
          
          if(low  >= high)return;
          int mid = (low + high)/2;
          MergeSort1(arr, low, mid);
          MergeSort1(arr, mid+1, high);
          Merge(arr,low,mid, high);
     }
     // making merge function to join the array

     public static void Merge(int arr[],int low,int mid,int high){

          ArrayList<Integer>  temp = new ArrayList<>();
          int left = low ;
          int right = mid+1;

          while(left<=mid && right <=high){
               if(arr[left] <= arr[right]){
                    temp.add(arr[left]);
                    left++;
               } else {
                    temp.add(arr[right]);
                    right++;
               }
          }
          while(left<= mid){
               temp.add(arr[left]);
               left++;
          }
          while(right <= high){
               temp.add(arr[right]);
               right++;
          }
          for(int i=low ; i<= high;i++){
               arr[i]=temp.get(i-low);
               // System.out.print(arr[i] + " ");
          }
     }
     public static void main(String[] args) {

          

          Scanner sc = new Scanner(System.in);
          System.out.println("enter n:");
          int n= sc.nextInt();

          int arr[] = new int[n];
          for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
          }
          System.out.println("before sorting the array");
          for(int i=0;i<n;i++){
               System.out.print(arr[i]+" ");
          }
          // InsertionSort(arr, n);
          // System.out.print("array is sorted using selection sort: ");
          
          // MergeSort(arr, 0, n);
          
          System.out.println("\n after sorting the array with merge sort");
          MergeSort1(arr, 0,5);

          for(int i=0;i<n;i++){
               System.out.print(arr[i]+" ");
          }

     }
}