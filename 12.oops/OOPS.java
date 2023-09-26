import java.security.cert.PolicyNode;
import java.text.Annotation;

public class OOPS {
     public static void main(String[] args) {
          
          // Area rectangle = new Area(2,4);
          // rectangle.getarea();
          Pen p1 = new Pen();//Pen() is a constructor
          p1.settip(4);
          // p1.setcolor("blue");

          // System.out.println("tip :"+ p1.gettip());
          // System.out.println("color :"+p1.getcolor());

          // Pen p2 = new Pen(4,"aaa");
          // System.out.println( p2.gettip());
          // System.out.println( p2.getcom());
          

          Pen copypen = new Pen(p1);
          // copypen.setcom("trimax");

          System.out.println(copypen.getcom());
          p1.shades[0]="yellow";
          p1.shades[1]="blue";
          p1.shades[2]="red";

          for(int i=0;i<3;i++){
               System.out.println(p1.shades[i]);
          }
          
          
     }
}
class Area{

     int length;
     int breadth;

     Area(int length,int breadth){
          this.length = length;
          this.breadth = breadth;
     }

     void getarea(){
          int a = length * breadth;
          System.out.println("area : "+a);
     }

}

class Pen {
     private int tip;
     private String color;
     String com;
     String shades[];
     Pen(int tip){
          this.tip = tip;
          shades = new String[3];
     }

     Pen(){
          System.out.println("non-parameterized constructor");
     }
     //copy constructor
     public Pen(Pen copypen){
          // this(copypen.tip,copypen.color);//this is use for copying all properties
          this.tip = copypen.tip;
          this.color = copypen.color;
          shades = new String[3];

     }

     Pen(int tip ,String com){
          this.tip = tip;
          this.com = com;
          shades = new String[3];

     }
     void setcom(String com){
          this.com = com;
     }
     String getcom(){
         return com;
     }
     


     void settip(int tip) {
          this.tip = tip;
     }
     int gettip() {
          return tip;
     }
     void setcolor(String color) {
          this.color = color;
     }
     String getcolor() {
          return color;
     }

}