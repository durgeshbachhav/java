import java.util.Scanner;

public class Loops {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          //while loops 
          // int count = 100;
          // while(count > 90) {
          //      System.out.println("hello world");
          //      count--;
          // }

          // print number 1 to 10 using while loops

          // int n=1;
          // while (n<=10) {
          //      System.out.println(n);
          //      n++;
          // }


          // print number 1 to n using while loop

          // int number=1;
          // int n = sc.nextInt();

          // while (number<=n) {
          //      System.out.print(number + " ");
          //      number++;
          // }


          // print the sum of first n natural number using while loops

          // int n = sc.nextInt();
          // int sum = 0;
          // int value = 1;

          // while (value <=n) {
          //      sum = sum + value;
          //      value++;
          // }
          // System.out.println(sum);
          // System.out.println();

          // for Loops

          // for(int i=0;i<10;i++){
          //      System.out.println("hello world");
          // }

          // print square pattrn
          // for (int i =1;i<=4;i++){
          //      System.out.println("****");
          // }

          // given example using while loop

          // int line = 1;
          // while (line <= 4) {
          //      System.out.println("****");
          //      line++;
          // }
          
          // print reverse of a number

          // int n = 23234;

          // while (n>0) {
          //      int lastdigit = n%10;
          //      System.out.print(lastdigit);
          //      n=n/10;
          // }

          // reverse the given number  

          // int n=10998;
          // int rev = 0;
          // while(n>0){
          //      int lastdigit =n % 10;   //getting last digit 
          //      rev = (rev *10)+lastdigit;
          //      n = n /10;
          // }
          // System.out.println(rev);

               // extra eg.
          // int a  = 5778234;
          // int rev = 0;

          // while (a>0) {
          //      int lastdigit = a%10;
          //      rev = (rev * 10)+lastdigit;
          //      a=a/10;
          // }
          // System.out.println(rev);



          // do while loops
               //do while loop execute atleast one time
               // int i = 1;
               // do{
               //      System.out.println("this is do while loops");
               //      i++;
               // }while(i<=10);



          // break and continue statement

          // for(int i=1;i<8;i++){
          //      if(i==6){
          //           break;
          //      }
          //      System.out.println(i);
          // }




          // System.out.println("enter your number");
          // do{
          //      int n = sc.nextInt();
          //      if(n%10==0){
          //           continue;
          //      }
          //      System.err.println(n);
          // }while(true);



          // continue statements 
          // do{
          //      System.out.println("enter your number");
          //      int n = sc.nextInt();
          //      if(n%10==0){
          //           continue;
          //      }
          //      System.err.println("number was : "+n);
          // }while(true);


          // check if number is prime or not

          // System.out.println("enter number");
          // int n=sc.nextInt();
          // if(n==2){
          //      System.out.println(n +" is prime number");
          // } else {
          //      boolean isPrime = true;

          //      for(int i=2;i<=n-1;i++){
          //           if(n%i==0){
          //                isPrime=false;
          //           }
          //      }
          //      if(isPrime==true){
          //           System.out.println(n + " is prime number");
          //      } else {
          //           System.out.println(n + " is not prime number");
          //      }
          // }


          // write a program that reads as set of intergers and then prints the sum of the even and odd number
          // int number;
          // int choice;
          // int evensum=0;
          // int oddsum=0;


          // do{
          //      System.out.println("enter the number");

          //      number = sc.nextInt();

          //      if(number%2==0){
          //           evensum+=number;
          //      } else {
          //           oddsum+=oddsum;
          //      }
          //      System.out.println("Do you want to continue? press 1 for yes or 0 for no");
          //      choice  = sc.nextInt();
          // }while(choice==1);

          // factorial program

          // System.out.println("enter number");
          // int n=sc.nextInt();
          // int fact =1;
          // for(int i=1;i<=n;i++){
          //      fact = fact * i;
          // }
          // System.out.println(fact);


          // multiplication table

          System.out.println("enter number");
          int n = sc.nextInt();

          for(int i=1;i<=10;i++){
               System.out.println(n+"x"+i+" = "+n*i);
          }
          
     }
}