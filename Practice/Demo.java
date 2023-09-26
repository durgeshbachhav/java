import java.util.*;
public class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int amount = sc.nextInt();
        // int rate = sc.nextInt();
        // int time = sc.nextInt();

        // int simple_interest = (amount *rate * time)/100;
        // System.out.println("Simple interest is: "+simple_interest);


        // System.out.println("enter a number: ");
        // int num = sc.nextInt();
        // boolean isprime = true;

        // if(num <= 1 ){
        //     isprime=false;
        //     System.out.println("not a prime number");
        // }else{
        //     // 2 se lekar number ke sq.root tak divisor check karne hai
        //     for(int i = 2 ; i<= Math.sqrt(num);i++){
        //         if(num % i == 0){
        //             isprime = false;
        //             break;
        //         }else{
        //             isprime=true;
        //         }
        //     }
        // }
        // if(isprime){
        //     System.out.println("it is prime number");
        // }else{
        //     System.out.println("not a prime number");
        // }

        // System.out.println("enter a number");
        // int n = sc.nextInt();
        // int sum = 0;
        // for(int i=1 ; i<=n;i++){
        //     sum = sum + i;
        // }
        // System.out.println(sum);


        //area of circle
        // System.out.println("enter radius");
        // int radius = sc.nextInt();

        // double areaofcircle =3.14 * (radius*radius); 
        // System.out.println(areaofcircle);

        // for(int i =9 ;i<=100;i++){
        //     if(i%2 != 0){
        //         System.out.println(i);
        //     }
        // }
    
        String str = "helloworld";
        char [] charArray = str.toCharArray();
        int len = charArray.length;


        for(int i=len;i>0;i--){
            System.out.println(charArray[i]);
        }

    }
}
