import java.util.Scanner;

public class Zeros {

     // brute solutin
     public static void LastZeros(int arr[]){
          
          int n = arr.length;
          int temp[] = new int[n];
          int k=0;
          
          for(int i=0;i<n;i++){
               if(arr[i]!=0){
                    temp[k]=arr[i];
                    k++;
               }   
          }
          while(k<n){
               temp[k]=0;
               k++;
          }
          for(int i=0;i<n;i++){
               System.out.print(temp[i]+" ");
          }
     }
     

     // optimalsolution
     public static void ZerosOptimal(int arr[], int n){
          int j=-1;
          for(int i=0;i<n;i++){
               if(arr[i]==0){
                    j=i;
                    break;
               }
          }

     
          
          for(int i=j+1;i<n;i++){
               if(arr[i]!=0){
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    j++;
               }
          }
     }

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          System.out.println("enter n: ");
          int n=sc.nextInt();
          int arr[]=new int[n];
          for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
          }
          ZerosOptimal(arr,n);
          for(int i=0;i<n;i++){
               System.out.print(arr[i]+" ");
          }
     }
}
