import java.util.*;
public class StarPattern{
     public static void Pattern1(int num){
          for(int time=0;time<num;time++){
               Scanner sc= new Scanner(System.in);
               System.out.println("enter n: ");
               int n=sc.nextInt();
               for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                         System.out.print("*");
                    }
                    System.out.println();
               }
          }
     }


     public static void Pattern2(int num){
          for(int time=0;time<num;time++){
               Scanner sc= new Scanner(System.in);
               System.out.println("enter n: ");
               int n=sc.nextInt();
               for(int i=0;i<=n;i++){
                    for(int j=0;j<i;j++){
                         System.out.print("*");
                    }
                    System.out.println();
               }
          }
     }

     public static void Pattern3(int num){
          for(int time=0;time<num;time++){
               Scanner sc= new Scanner(System.in);
               System.out.println("enter n: ");
               int n=sc.nextInt();
               for(int i=1;i<=n;i++){
                    for(int j=1;j<=i;j++){
                         System.out.print(j +" ");
                    }
                    System.out.println();
               }
          }
     }

     public static void Pattern4(int num){
          for(int time=0;time<num;time++){
               Scanner sc= new Scanner(System.in);
               System.out.println("enter n: ");
               int n=sc.nextInt();
               for(int i=1;i<=n;i++){
                    for(int j=1;j<=i;j++){
                         System.out.print(i +" ");
                    }
                    System.out.println();
               }
          }
     }

     public static void Pattern5(int num){
          for(int time=0;time<num;time++){
               Scanner sc= new Scanner(System.in);
               System.out.println("enter n: ");
               int n=sc.nextInt();
               for(int i=0;i<=n;i++){
                    for(int j=1;j<=n-1-i;j++){
                         System.out.print(j+" ");
                    }
                    System.out.println();
               }
          }
     }

     public static void Pattern6(int num){
          for(int time=0;time<num;time++){
               Scanner sc= new Scanner(System.in);
               System.out.println("enter n: ");
               int n=sc.nextInt();
               for(int i=0;i<=n;i++){
                    for(int j=1;j<=n-i;j++){
                         System.out.print(j+" ");
                    }
                    System.out.println();
               }
          }
     }

     public static void Pattern7(int num){
          for(int i=0;i<=num;i++){
               // it is for spaces
               for(int j=0;j<=num-i-1;j++){
                    System.out.print(" ");
               }
               // it is for star
               for(int j=0;j<2*i+1;j++){
                    System.out.print("*");
               }
               //we dont need this for this our task is print star only not spaces
               // it is for spaces
               // for(int j=0;j<=num-i+i;j++){ 
               //      System.out.print("");
               // }
               System.out.println();
          }
     }

     public static void Pattern8(int num){
          for(int i=0;i<=num;i++){
               // it is for spaces
               for(int j=0;j<i;j++){
                    System.out.print(" ");
               }
               // it is for star
               for(int j=0;j<2*num-(2*i-1);j++){
                    System.out.print("*");
               }
               // it is for spaces
               // for(int j=0;j<i;j++){
               //      System.out.print(" ");
               // }
               System.out.println();
          }
     }

     public static void Pattern10(int num){
          for(int i=0;i<=num*2-1;i++){
               // when i is equal to the no of row 
               int star = i;
               // when i is greater than equal to the row
               if(i>num) star=2*num-i;
               for(int j=1;j<=star;j++){
                    System.out.print("*");
               }
               System.out.println();
          }
     }

     public static void Pattern11(int num){
          int start =1;
          for(int i=0;i<num;i++){
               if(i%2==0)
               start=1;
               else
               start=0;
               for(int j = 0; j<=i;j++){
                    System.out.print(start);
                    start= 1-start;
               }
               System.out.println();
          }
     }

     public static void Pattern12(int num){
          int spaces = 2*(num-1);
          for(int i=1;i<=num;i++){

               for(int j=1;j<=i;j++){
                    System.out.print(j);
               }
               for(int j=1;j<=spaces;j++){
                    System.out.print(" ");
               }
               for(int j=i;j>=1;j--){
                    System.out.print(j);
               }
               System.out.println();
               spaces-=2;
          }
     }

     public static void Pattern13(int num){
          int count =1;
          for(int i=0;i<num;i++){
               for(int j=0;j<=i;j++){
                    System.out.print(count + " ");
                    count=count + 1;
               }
               System.out.println();
          }
     }

     public static void Pattern14(int num){
          for(int i=0;i<num;i++){
                    for(char ch='A';ch<='A'+ i;ch++){
                    System.out.print(ch + " ");

               }
               System.out.println();
          }
     }
     
     public static void Pattern15(int num){
          for(int i=0;i<num;i++){
                    for(char ch='A';ch<='A'+ (num-i-1);ch++){
                    System.out.print(ch + " ");

               }
               System.out.println();
          }
     }

     public static void Pattern16(int num){
          for(int i=0;i<num;i++){
                    for(int j=0;j<=i;j++){
                    System.out.print((char)((int)('A'+i))+" ");

               }
               System.out.println();
          }
     }

     public static void Pattern17(int num){
          for(int i=0;i<=num;i++){
               // it is for spaces
               for(int j=0;j<=num-i-1;j++){
                    System.out.print(" ");
               }
               // it is for star
               char ch='A';
               int breakpoint =(2*i-1)/2;
               for(int j=1;j<= 2*i-1;j++){
                    System.out.print(ch);
                    if(j<= breakpoint)ch++;
                    else
                    ch--;
                    
               }
               // it is for spaces
               for(int j=0;j<=num-i+i;j++){ 
                    System.out.print(" ");
               }
               System.out.println();
          }
     }

     public static void Pattern18(int num){
          for(int i=0;i<num;i++){
               for(char ch =(char)(int)('A'+num-1-i);ch<=(char)(int)('A'+num-1);ch++){
                    System.out.print(ch+" ");
               }
               System.out.println();
          }
     }

     public static void Pattern19(int num){
          int spaces =0;
          for(int i=0;i<num;i++){
               for(int j=1;j<=num-i;j++){
                    System.out.print("*");
               }
               for(int j=0;j<spaces;j++){
                    System.out.print(" ");
                    
               }
               for(int j=1;j<=num-i;j++){
                    System.out.print("*");
               }
               spaces+=2;
               System.out.println();
          }
          
          
          int space = 2*(num-1);
          for(int i=1;i<=num;i++){

               for(int j=1;j<=i;j++){
                    System.out.print("*");
               }
               for(int j=1;j<=space;j++){
                    System.out.print(" ");
               }
               for(int j=i;j>=1;j--){
                    System.out.print("*");
               }
               System.out.println();
               space-=2;
          }
     }

     public static void Pattern20(int num){
          
          int space = 2*(num-1);
          for(int i=1;i<=num;i++){

               for(int j=1;j<=i;j++){
                    System.out.print("*");
               }
               for(int j=1;j<=space;j++){
                    System.out.print(" ");
               }
               for(int j=i;j>=1;j--){
                    System.out.print("*");
               }
               System.out.println();
               space-=2;
          }


          
          for(int i=1;i<=num;i++){

               for(int j=1;j<=num-i;j++){
                    System.out.print("*");
               }
               for(int j=1;j<=2*i;j++){
                    System.out.print(" ");
               }
               for(int j=1;j<=num-i;j++){
                    System.out.print("*");
               }
               System.out.println();
               
          }
     }

     public static void Pattern21(int num){
          for(int i=0;i<num;i++){
               for(int j=0;j<num;j++){
                    if(i==0 || j==0 || i==num-1 || j==num-1){
                         System.out.print("*");
                    }
                    else
                    System.out.print(" ");
               }
               System.out.println();
          }
     }

     public static void Pattern22(int num){
          int count = 2*num-1;
          for(int i=0;i<count;i++){
               for(int j=0;j<count;j++){
                    int top = i;
                    int left = j;
                    int right = (2*num-2)-j;
                    int bottom = (2*num-2)-i;
                    System.out.print(num- Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
                    
               }
               System.out.println();
          }
     }
     public static void main(String[] args) {
          int n=5;
          Pattern20(n);
          
     }
}