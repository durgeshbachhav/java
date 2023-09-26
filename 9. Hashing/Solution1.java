import java.util.Scanner;
import java.util.HashMap;;

public class Solution1 {

     public static void NumberHashing(int arr[]){
          Scanner sc = new Scanner(System.in);
          int hashh[]= new int[100];
          for(int i=0;i<arr.length;i++){
               hashh[arr[i]]+=1;
          }
          System.out.println("enter no.of query");
          int q=sc.nextInt();
          for(int i=0;i<q;i++){
               int m=sc.nextInt();
               System.out.println( "apperance is: "+hashh[m]);
          }
     }
     
     public static void characterHashingforsmallcase(String s){
          Scanner sc= new Scanner(System.in);
          int hasharray[]=new int[26];
          for(int i=0;i<s.length();i++){
               hasharray[s.charAt(i)-'a']++;
          }
          System.out.println("enter no of queries:");
          int q=sc.nextInt();
          for(int i=0;i<q;i++){
               char ss =sc.next().charAt(0);
               System.out.println("apperance : "+ hasharray[ss-'a']);
          }
     }
     public static void characterHashingforallcase(String s){
          Scanner sc= new Scanner(System.in);
          int hasharray[]=new int[256];
          for(int i=0;i<s.length();i++){
               hasharray[s.charAt(i)]++;
          }
          System.out.println("enter no of queries:");
          int q=sc.nextInt();
          for(int i=0;i<q;i++){
               char ss =sc.next().charAt(0);
               System.out.println("apperance : "+ hasharray[ss]);
          }
     }

     public static void NumberHashingForlargeSize(int arr[]){
          Scanner sc = new Scanner(System.in);
          HashMap <Integer,Integer> map = new HashMap<>();
          for(int i=0;i<arr.length;i++){
               int key = arr[i];
               int freq = 0;
               if(map.containsKey(key))
               freq= map.get(key);
               freq++;
               map.put(key, freq);
          }

          System.out.println("enter query:");
          int q = sc.nextInt();
          for(int i=0;i<q;i++){
               int s = sc.nextInt();
               if(map.containsKey(s)){
                    System.out.println(map.get(s));
               } else {
                     System.out.println(0);
               }
          }

     }

     public static void main(String[] args) {

          // number hashing
          
          // Scanner sc = new Scanner(System.in);
          // System.out.println("enter n: ");
          // int n = sc.nextInt();
          // int arr[] = new int[n];
          // for(int i=0;i<n;i++){
          //      arr[i]=sc.nextInt();
          // }
          // NumberHashing(arr);


          // character hashing
          // String s="abcdabc";
          // characterHashingforallcase(s);               


          // number hashing for upto 10^8 which using hashmap
          Scanner sc = new Scanner(System.in);
          System.out.println("enter n: ");
          int n = sc.nextInt();
          int arr[] = new int[n];
          for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
          }
          
          NumberHashingForlargeSize(arr);
     }
}
