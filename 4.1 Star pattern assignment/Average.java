import java.util.*;

import javax.sound.sampled.ReverbType;

public class Average{
     public static void avg() {
          Scanner sc=new Scanner(System.in);
          System.out.print("enter no.1: ");
          int n1= sc.nextInt();
          System.out.print("enter no.2: ");
          int n2= sc.nextInt();
          System.out.print("enter no.3: ");
          int n3= sc.nextInt();
          System.out.println("The average is : "+(n1+n2+n3)/3);
          
     }

     public static void main(String[] args) {
          avg();
     }
}
