import java.util.*;

public class Example4 {
     public static int factorial(int n){
          if(n ==0)return 1;
          else return (n*factorial(n-1));
     }

     
     public static void printn(int i,int n){
          if(i> n)return ;
          System.out.println(i);
          
          printn(i+1, n);
     }

     
      
     public static void PrintName(int i,int n){
          if(i>n)return;
          System.out.println("durgesh");
          i++;
          PrintName(i,n);
     }

     
     public static void reverseNum(int i,int n){
          if(i<1) return;
          System.out.print(i+" ");
          
          reverseNum(i-1,n);
     }

     public static void BacktrackNum(int i, int n){
          if(i<1)return;
          BacktrackNum(i-1, n);
          System.out.print(i+" ");
     }
     public static void SumFirstNum(int i,int sum){
          if(i<1){
               System.out.println(sum);
               return;
          }
          SumFirstNum(i-1, sum+i);
     }
     public static int SumFirstNumfunctional(int i){
          if(i==1){
               return 0;
          }
          return i+SumFirstNumfunctional(i-1);
     }
     public static int factorialbacktracking(int n){
          if(n==0  )
               return 1;
          
          return n * factorialbacktracking(n-1);
    
     }

     public static int ReverseArray(int i, int arr[], int n){
          if(i>=n/2) return 0;
          int temp = arr[i];
          arr[i]=arr[n-i-1];
          arr[n-i-1]=temp;
          return ReverseArray(i+1,arr,n);

     }


     public static boolean CheckPalimdrome(int i, String s){
          
          if(i>=s.length()/2) return true;
          if ((s.charAt(i)) != (s.charAt(s.length()-i-1))) 
            return false;  
          return CheckPalimdrome(i+1, s);
     }

     public static int fibonacci(int n){
          if(n<=1) return n;
          int last = fibonacci(n-1);
          int secondlast = fibonacci(n-2);
          return last+secondlast;

     }
     public static void main(String[] args) {
          
     // printn(1,5);
     // PrintName(1,5);
     // reverseNum(6,6);
     // BacktrackNum(5,5);
     // SumFirstNum(5,0);
     // int fact = factorialbacktracking(5);
     // System.out.println("factorial is : "+fact);
     // int n= 5;
     // int[] arr = new int[n]; 
	// 	Scanner sc=new Scanner(System.in);  
	// 	for(int i=0;i<n;i++){
	// 	    arr[i]=sc.nextInt();
	// 	}
	// 	ReverseArray(0,arr,n);
	// 	for(int i=0;i<n;i++){
	// 	    System.out.print(" "+ arr[i]);
	// 	}
     // }
          // System.out.println(CheckPalimdrome(0, "12321"));

          System.out.println("fibonacci: "+fibonacci(14));

}
}