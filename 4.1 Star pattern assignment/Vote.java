import java.util.Scanner;

public class Vote {
     public static boolean VoteAllow(int age) {
          return age >= 18;
     }
     public static void main(String[] args) {
          // System.out.println("eligible for voting :"+VoteAllow(17));

          Scanner sc = new Scanner(System.in);
          int positiveNUm =0;
          int negitiveNUm =0;
          int zeros = 0;
          char choice;

          do{
               System.out.println("enter number: ");
               int num = sc.nextInt();

               if(num>0){
                    positiveNUm++;
               } else if(num<0){
                    negitiveNUm++;
               }else{
                    zeros++;
               }
               System.out.println("do you want to continue: ");
               choice = sc.next().charAt(0);
          }while(choice=='y' || choice=='Y');

          System.out.println("positive count : "+positiveNUm);
          System.out.println("negative count : "+negitiveNUm);
          System.out.println("zeros count : "+zeros);
     }
}
