import java.util.*;;

public class MathFunction {
     public static double CheckMaximum(Double a, Double b) {
          // maximum of two number
          return Math.max(a,b);
     }
     public static double CheckMinimum(Double a, Double b) {
          // minimum of two number
          return Math.min(a,b);
     }
     public static double SquareRoot(Double a) {
          // return the square root of y   
          return Math.sqrt(a);
     }
     public static double Power(Double a,Double b) {
          //returns 28 power of 4 i.e. 28*28*28*28    
          return Math.pow(a,b);
     }
     public static double logofnum(Double a) {
          // return the logarithm of given value 
          return Math.log(a);
     }
     public static double logbase10(Double a) {
           // return the logarithm of given value when base is 10    
          return Math.log10(a);
     }
     public static double logXPlusOne(Double a) {
          // return the log of x + 1 
          return Math.log1p(a);
     }
     public static double Expression(Double a) {
            // return a power of 2   
          return Math.exp(a);
     }
     public static double PowerMinusOne(Double a) {
          // return (a power of 2)-1 
          return Math.expm1(a);
     }

     public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
          System.out.print("enter first number : ");
          double a = sc.nextDouble();
          System.out.print("enter second number : ");
          double b = sc.nextDouble();
          System.out.println("check between "+a+" and "+b+" which is maximum :"+CheckMaximum(a, b));
          System.out.println("check between "+a+" and "+b+" which is minimum :"+CheckMinimum(a, b));
          System.out.println(a+ " square root is : "+SquareRoot(a));
          System.out.println(b+ " square root is : "+SquareRoot(b));
          System.out.println("power of a and b is : " +Power(a,b));
          System.out.println("log of a is : " +logofnum(a));
          System.out.println("log of b is : " +logofnum(b));
          System.out.println("log10 of a is : " +logbase10(a));
          System.out.println("log10 of b is : " +logbase10(b));
          System.out.println("log x+1  of a is : " +logXPlusOne(a));
          System.out.println("log x+1  of b is : " +logXPlusOne(b));
          System.out.println("Expression  of a is : " +Expression(a));
          System.out.println("Expression  of b is : " +Expression(b));
          System.out.println("power minus one  of a is : " +PowerMinusOne(a));
          System.out.println("power minus one  of b is : " +PowerMinusOne(b));

     }
}
