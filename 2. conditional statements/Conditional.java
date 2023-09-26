import java.util.*;

public class Conditional {
    public static void main(String[] args) {
        // System.out.println("enter your age: ");
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if(age>=18){
        // System.out.println("you can vote,drive");
        // }
        // if(age > 13 && age < 18){
        // System.out.println("teenager");
        // }
        // else{
        // System.err.println("you can't drive or vote");
        // }

        // print the largest of 2
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // if(n1 > n2){
        // System.out.println("max : "+n1);
        // }else
        // {
        // System.out.println("max : "+n2);
        // }

        // print if a number is even or odd

        // int num = sc.nextInt();
        // if(num%2==0){
        // System.out.println("number is even ");
        // }
        // else {
        // System.out.println("number is odd");
        // }

        // else if

        // int age = sc.nextInt();

        // if (age >=18) {
        // System.out.println("vote");
        // }else if (age >13 && age < 18) {
        // System.out.println("teenager");
        // }else{
        // System.out.println("cant vote");
        // }

        // income tax calculator

        // int income = sc.nextInt();
        // int tax;
        // if (income < 500000) {
        // tax=0;
        // } else if (income >=500000 && income < 1000000) {
        // tax =(int) (income * 0.2);
        // }
        // else{
        // tax = (int)(income * 0.3);
        // }
        // System.out.println("your tax is: "+tax);

        // print the largest of 3 number

        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // int n3 = sc.nextInt();

        // if (n1>=n2 && n1>=n3) {
        // System.out.println(n1 + " is maximum number");
        // }else if (n2>=n1 && n2>=n3) {
        // System.out.println(n2 +" is maximum number");
        // }
        // else{
        // System.out.println(n3 + " is maximum number");
        // }

        // ternary operator

        // int age = sc.nextInt();

        // String vote =(age>=18)?"vote":"you cant vote";
        // System.out.println(vote);

        // check student is passed of failed using ternary operator

        // int marks = sc.nextInt();

        // String result=(marks >=33)?"pass":"failed";
        // System.out.println(result);

        // if(marks >=33){
        // System.out.println("pass");
        // } else {
        // System.out.println("failed.......!");
        // }

        // switch statements

        // int btn = sc.nextInt();

        // switch (btn) {
        // case 1:System.out.println("fan");
        // break;
        // case 2:System.out.println("light");
        // break;
        // case 3:System.out.println("tv");
        // break;

        // default:System.out.println("all btns are off");
        // break;
        // }

        // calculator
        // System.out.println("enter a:");
        // int a = sc.nextInt();
        // System.out.println("enter b:");
        // int b = sc.nextInt();
        // System.out.println("enter operator:");
        // char operation =sc.next().charAt(0);

        // switch (operation) {
        // case '+':System.out.println(a+b);
        // break;
        // case '-':System.out.println(a-b);
        // break;
        // case '*':System.out.println(a*b);
        // break;
        // case '/':System.out.println(a/b);
        // break;
        // case '%':System.out.println(a%b);
        // break;
        // default:System.out.println("please enter valid operator");
        // break;
        // }

        // practice question

        /*
         * write a java program to get a number from the user and print whether it is
         * positive or negative.
         * 
         */
        // System.out.println("enter number :");
        // int num = sc.nextInt();

        // if (num>=0) {
        // System.out.println("number is positive");
        // }else{
        // System.out.println("number is negative");
        // }

        // question 2

        // double temp = sc.nextDouble();

        // if(temp>100){
        // System.out.println("you have fewer");
        // } else {
        // System.out.println("you dont have fewer");
        // }

        // weekdays using switch statement

        // int daynumber = sc.nextInt();
        // switch (daynumber) {
        // case 1:System.out.println("sunday");
        // break;
        // case 2:System.out.println("monday");
        // break;
        // case 3:System.out.println("tuesday");
        // break;
        // case 4:System.out.println("wednusday");
        // break;
        // case 5:System.out.println("thusday");
        // break;
        // case 6:System.out.println("friday");
        // break;
        // case 7:System.out.println("saturday");
        // break;

        // default:System.err.println("enter valid day number");
        // break;
        // }

        // leap year
        System.out.println("input a year to check it is leap or not: ");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100) == 0 || (year % 400) == 0);

        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

    }
}