public class SecondLargestOptinal {

     public static int Secondlargest(int arr[],int n){

          int largest = arr[0];
          int slargest = Integer.MIN_VALUE;

          for(int i=0;i<n;i++){
               if(arr[i]>largest){
                    slargest=largest;
                    largest=arr[i];
               }else if(arr[i] < largest && arr[i] > slargest){
                    slargest=arr[i];
               }
          }
          return slargest;
     }
     public static int Secondsmallest(int arr[],int n){

          int smallest = arr[0];
          int ssmallest = Integer.MAX_VALUE;

          for(int i=1;i<n;i++){
               if(arr[i] < smallest){
                    ssmallest=smallest;
                    smallest=arr[i];
               }else if(arr[i] != smallest && arr[i] < ssmallest){
                    ssmallest=arr[i];
               }
          }
          return ssmallest;
     }
     

     public static void main(String[] args) {
          
          int arr[]={1,2,4,7,7,5};
          int n = arr.length;
          int small=Secondsmallest(arr,n);
          int large=Secondlargest(arr,n);
          System.out.println("second largest in array : "+large);
          System.out.println("second smallest in array : "+small);
     }
}
