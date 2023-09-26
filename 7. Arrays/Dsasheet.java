import java.util.Scanner;

public class Dsasheet {
     
     public static int FindSum(int A[],int N){
     
          int max=Integer.MIN_VALUE;
          int min=Integer.MAX_VALUE;
          for(int i=0;i<N;i++){
               if(max<A[i]){
                    max=A[i];
               }
          }
          return max;
     }

     public static void main(String[] args) {
          
          Scanner sc= new Scanner(System.in);
          System.out.println("enter how many array elements: ");
          int N= sc.nextInt();
          int A[]= new int[N];
          for(int i=0;i<N;i++){
               A[i]=sc.nextInt();
          }

          System.out.println("maximum number in array is : "+FindSum(A, N));
     }
}
