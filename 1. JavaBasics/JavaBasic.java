// import java.util.*;

public class JavaBasic {
     public static void main(String[] args) {
          // write code here
          // output pattern with different function
          // System.out.println("hello world"); //println
          // System.out.print("hello world\n"); //print
          // System.out.print("hello world");// \n

          /*
           * print star pattern
           * ****
           * ***
           * **
           * *
           */

          // System.out.println("****");
          // System.out.println("***");
          // System.out.println("**");
          // System.out.println("*");

          // variable in java
          /*
           * variable changed their values === it can be changed
           * literals = means value never changed ex. 1 is always 1 not change 3 ya 4
           * ex.a is not change their original value to the b. a kabi b nhi hogo
           */

          // int a = 10;
          // System.out.println(a);

          // Data types in java
          /*
           * there are two types of data type
           * [1 bytes = 8 bits]
           * 1)primitive : which is already make by java or already make packages
           * -byte (1 byte) = store 256 number [range = (-128 to 127)]
           * -boolean (1 byte) [true or false]
           * -short (2 byte) [it store number (not must used)]
           * -char (2 byte) [A-Z,a-z, and special charcter]
           * -int (4 byte) [-2 billion to 2 billion] when value is integer
           * -long (8 byte) [-4 billion to 4 billion] when integer value is big
           * -float (4 byte) [-2 billion to 2 billion] use f in end of the value
           * -double (8 byte) [-4 billion to 4 billion] when data type is float and
           * decimal value is big
           * 
           * 2)non-primitive : which make by yourself
           * -string
           * -array
           * -class
           * -object
           * -interface
           */

          // input in java
          /*
           * we use scanner class to read input from user
           * use package == import java.util.*;
           * 
           * accepting input from user then which function use for there data type
           * -next for char (util the space then its terminate)
           * -nextLine (used for string)
           * -nextInt (used for integer)
           * -nextLong( used for big interger)
           * -nextFloat (used for decimal values)
           * -nextDouble ( used for big decimal number)
           * -nextBoolean ( used for true or false)
           * -nextShort ( used for interger)
           * -nextByte ( used for byte)
           */

          // sum of two number

          // int a = 10 ;
          // int b = 20;
          // int sum = a+b;
          // System.out.println(sum);

          // sum of two number using accepting input

          // Scanner sc = new Scanner(System.in);
          // int num1 = sc.nextInt();
          // int num2 = sc.nextInt();
          // float sum =(float) num1 + num2;
          // System.out.println(sum);

          // area of circle

          // Scanner sc = new Scanner(System.in);
          // float radius = sc.nextFloat();
          // float area = 3.14f * radius * radius;
          // System.out.println(area);



          // type conversion also called implicit and widening conversion
          /* conversion happens when
               1)type compatible : means int -> float is possible but float -> int is not possible

               2)destination type is larger than source type


               path to type conversion
               byte > short > int > float > long > double

               these path can be reverse but it is lozzy conversion which lost our data

               lets see the example
           */

          //  type conversion example
               // example 1
          // float n1 = 10.20f;
          // int n2 =(int) n1;
          // System.out.println(n2);

          // ex == 2
          // double  n1 = 55;
          // long n2 =(long) n1;
          // System.out.println(n2);


          // char to int type casting is possible because ascii value

          // char ch = 'a';
          // int a = ch;
          // System.out.println(a);


          // practice question
          /*
           * in a program , input 3 numbers A, B and C you have to output the average of these 3 numbers.
           */
          //solution
          //  Scanner sc = new Scanner(System.in);
          //  float n1 = sc.nextFloat();
          //  float n2 = sc.nextFloat();
          //  float n3 = sc.nextFloat();
          //  double average = (n1 +n2 +n3) /3;
          //  System.out.println(average);

          //end

          /*
           * In a program, input the side of a square  you have to output the area of the square
           */

           //solution
          //  Scanner sc = new Scanner(System.in);
          //  int area = sc.nextInt();
          //  int area_of_square = area * area;
          //  System.out.println(area_of_square);


          /*
           * enter cost of 3 items from the user (using float data type) a pencil, a pen, and  an eraser
           * You have to output the total costof the item back to the user as their bill.( add on : you can also 
           * try 18%gst tax to the item in the bill as an advanced problem)
           */

          //  Scanner sc = new Scanner(System.in);
          //  float pencil = sc.nextFloat();
          //  float pen = sc.nextFloat();
          //  float eraser = sc.nextFloat();

          //  float total_bill = (pencil + pen + eraser);
          //  System.out.println(total_bill);

           //add gst

          //  float total_bill_with_gst = total_bill + (0.18f *total_bill);
          //  System.out.println("bill with gst : "+total_bill_with_gst);



          // check output
          // byte b = 4;
          // char ch = 'a';
          // short  s = 512;
          // int i = 1000;
          // float f = 3.14f;
          // double d = 99.9954;

          // double result = ((f*b)+(i%ch)-(d*s));
          // System.out.println(result);


          // int $ = 24;enter cost of 3 items from the user (using float data type) a pencil, a pen, and  an eraser
          //  * You have to output the total costof the item back to the user as their bill.( add on : you can also 
          //  * try 18%gst tax to the item in the bill as an advanced problem)
          // System.out.println($);


          //ex-1
          // int x=2,y=5;
          // int ex1 = (x * y / x);
          // int ex2 = (x *(y/x));
          // System.out.println(ex1);
          // System.out.println(ex2);

          //ex-2
          // int x=200,y=50,z=100;
          // if(x>y && y>z){
          //      System.out.println("hello");
          // }
          // if(z>y && z<x){
          //      System.out.println("java");
          // }
          // if((y+200) < x && (y+150) < x){
          //      System.out.println("hello java");
          // }


          //ex-3
          // int x,y,z;
          // x=y=z=2;
          // x += y; // 2 + 2 =4
          // y -= z; // 2-2 = 0
          // z/=(x+y); //2/4+0=2
          // System.out.println(x + " "+ y+ " "+ z);



          



     }
}